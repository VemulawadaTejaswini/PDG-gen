import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for(int i = 0;i < number ;i++){
			String[] _s = sc.nextLine().split("[\\s]+");
			double[] x = new double[4];
			double[] y = new double[4];
			
			x[0] = Double.parseDouble(_s[0]);
			y[0] = Double.parseDouble(_s[1]);
			
			x[1] = Double.parseDouble(_s[1]);
			y[1] = Double.parseDouble(_s[1]);
			
			x[2] = Double.parseDouble(_s[2]);
			y[2] = Double.parseDouble(_s[2]);
			
			x[3] = Double.parseDouble(_s[3]);
			y[3] = Double.parseDouble(_s[3]);
			
			double det = (x[1] - x[0]) * (y[3] - y[2]) - (y[1] - y[0]) * (x[3] - x[2]);
            System.out.println(det == 0.0 ? "YES" : "NO");
		}
	}
}