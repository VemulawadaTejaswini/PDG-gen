import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
		//test();
	}
	public static void test(){
		double x = 1.234567890;
		double y = 9.876543210;
		//小数点代4位を四捨五入
		System.out.println(x + " " + y);
		y *= 1000;
		y = (double)Math.round(y) / 1000;
		x *= 1000;
		x = (double)Math.round(x) / 1000;
		System.out.println(x + " " + y);
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		//a0 1b 2c 3d 4e 5f
		double[] v = new double[6];
		double x = 0;
		double y = 0;
		while(sc.hasNextDouble()){
			//boolean bAns = false;
			//System.out.println("ts");
			//Math.round
			for(int i = 0; i < 6; i++){
				v[i] = sc.nextDouble();
				//System.out.println(i + " " + v[i]);
			}
			//sc.nextInt();
			if(v[0] == 0){
				y = v[2] / v[1];
				x = v[5] - v[4]*y;
				x /= v[3];
			}
			else if(v[1] == 0){
				x = v[2] / v[0];
				y = v[5] - v[3]*x;
				y/= v[4];
			}
			else if(v[3] == 0){
				y = v[5] / v[4];
				x = v[2] - v[1]*y;
				x /= v[0];
			}
			else if(v[4] == 0){
				x = v[5] / v[3];
				y = v[2] - v[0]*x;
				y/= v[1];
			}
			else{
				double tmp1 = v[1] * v[3] - v[0] * v[4];
				double tmp2 = v[3] * v[2] - v[0] * v[5];
				y = tmp2 / tmp1;

				x = v[2] - v[1]*y;
				x /= v[0];

			}
			//小数点代4位を四捨五入
			y *= 1000;
			y = (double)Math.round(y) / 1000;
			x *= 1000;
			x = (double)Math.round(x) / 1000;
			//System.out.println(x + " " + y);
			System.out.printf("%.3f %.3f\n", x,y);
		}
		sc.close();
	}

}