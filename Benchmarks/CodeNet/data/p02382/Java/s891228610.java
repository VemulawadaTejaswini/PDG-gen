import java.util.Scanner;

public class Main {

	
	/**２つのn次元ベクトルが与えられるので、それぞれの
	 * ミンコフスキー距離を求めるプログラム
	 * 
	 * @param args inputベクトルの次元、ｘ座標、ｙ座標 output: 1、2、3、∞ それぞれの距離
	 */
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		int vec_num = scan.nextInt();
		//int vec_num = Integer.parseInt(args[0]);
		//p = 1
		double D_1 =0;
		double D_2 = 0;
		double D_3 = 0;
		double D_inf = 0;
		
		//一時的に入力されたｘとｙの座標を別々に格納する
		double[] tmp_x = new double[vec_num];
		double[] tmp_y = new double[vec_num];
		for(int i = 0; i< vec_num;i++){
			tmp_x[i] = scan.nextDouble();
			}
		for(int i = 0; i < vec_num;i++){
			tmp_y[i] = scan.nextDouble();
		}

		//ミンコフスキー距離を求める
		for(int i = 0; i<vec_num;i++){
			double x = tmp_x[i];
			double y = tmp_y[i];

			D_1 = D_1 + Math.abs(x - y );
			D_2 = D_2 + Math.pow(Math.abs(x - y), 2);

			D_3 = D_3 + Math.pow(Math.abs(x - y), 3);
			if(D_inf < Math.abs(x-y)){
				D_inf = Math.abs(x-y);
			}
		}


		D_2 = Math.sqrt(D_2);
		D_3 = pow_1_3(D_3);
		System.out.println(D_1);
		System.out.println(D_2);
		System.out.println(D_3);
		System.out.println(D_inf);
		//p = 2

		//p = 3

		//p = ∞
	}
	//3乗根を求める
	//powの近似値→Newton法の漸化式
	static double pow_1_3(double a){
		double x = Math.pow(a, 1./3);
		if(x != 0){
			return (2 * x + a / x / x ) /3;
		}else{//0では割り切れないので別途対応
			return 0;
		}

	}
}
