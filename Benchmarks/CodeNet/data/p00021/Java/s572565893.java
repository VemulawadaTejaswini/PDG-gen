import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double a[] = new double[n];
		double b[] = new double[n];
		double x[] = new double[4];
		double y[] = new double[4];
		for(int i = 0; i < n ; i++){
			for(int j = 0 ; j < 4 ; j++){
				x[j] = scan.nextDouble();
				y[j]= scan.nextDouble();
			}
			a[i] = (y[1]-y[0])/(x[1]-x[0]);
			b[i] = (y[3]-y[2])/(x[3]-x[2]);
		}
		for(int i = 0; i < n ; i++){
			if(a[i] == b[i]){
				System.out.println("YSE");
			}else{
				System.out.println("NO");
			}
		}
	}
}