import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x1=0,x2=0,y1=0,y2=0;
		double[] tmp = new double[4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; ++i){
			tmp[i] = sc.nextDouble();
			System.out.println(tmp[i]);
		}
		x1 = tmp[0]; y1 = tmp[1]; x2 = tmp[2]; y2 = tmp[3];
		double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("%f\n", d);
		sc.close();
	}

}