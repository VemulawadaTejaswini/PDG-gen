import java.util.Scanner;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			for(int i = 0; i < n ; i++){
				double x[] = new double[4];
				double y[] = new double[4];
				for(int j = 0 ; j < 4 ; j++){
					x[j] = scan.nextDouble();
					y[j] = scan.nextDouble();
				}
				double a = (y[1] - y[0]) / (x[1] - x[0]);
				double b = (y[3] - y[2]) / (x[3] - x[2]);
				if(a == b){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}
	}
}