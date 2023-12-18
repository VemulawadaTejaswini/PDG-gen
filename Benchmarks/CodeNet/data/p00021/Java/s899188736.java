import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	static int n;
	static float[] x = new float[4];
	static float[] y = new float[4];

	public static void main(String[] args) {
		n = sc.nextInt();
		
		for(int i=0; i < n; i++){
			read();
			solve();
		}

	}
	
	static boolean read() {
		
			for(int j=0; j < 4; j++){
				x[j] = sc.nextFloat();
				y[j] = sc.nextFloat();
			}
		
		return true;
	}
	
	static void solve(){
			System.out.println((y[0] - y[1])/(x[0] - x[1]) == (y[2] - y[3])/(x[2] - x[3])?"YES":"NO"); 
	}

}