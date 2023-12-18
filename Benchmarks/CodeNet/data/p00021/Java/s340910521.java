import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i < n;i++){
			double[] x = new double[4];
			double[] y = new double[4];
			for(int j = 0;j < 4;j++){
				x[j] = scan.nextDouble();
				y[j] = scan.nextDouble();
			}
			double a1 = 0;
			double a2 = 0;
			double b1 = 0;
			double b2 = 0;
			if(x[0]-x[1] != 0){
				a1 = (y[0]-y[1])/(x[0]-x[1]);
				b1 = (x[0]*y[1] - x[1]*y[0])/(x[0]-x[1]);
			}else{
				a1 = 1000;
				b1 = y[0];
			}
			if(x[2] - x[3] != 0){
				a2 = (y[2]-y[3])/(x[2]-x[3]);
				b2 = (x[2]*y[3] - x[3]*y[2])/(x[2]-x[3]);
			}else{
				a2 = 1000;
				b2 = y[2];
			}
			if(a1 == a2 && b1 != b2){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}