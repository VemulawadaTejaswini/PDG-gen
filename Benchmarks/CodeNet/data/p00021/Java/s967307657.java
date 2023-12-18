import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	static int n, m = 0;
	static float[][] x;
	static float[][] y;

	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	static boolean read() {
		if(m == 1) return false;
		
		n = sc.nextInt();
		
		x = new float[n][4];
		y = new float[n][4];
		
		for(int i=0; i < n; i++){
			for(int j=0; j < 4; j++){
				x[i][j] = sc.nextFloat();
				y[i][j] = sc.nextFloat();
			}
		}
		
		m = 1; 
		
		return true;
	}
	
	static void solve(){
		for(int i=0; i < n; i++){
			System.out.println((y[i][0] - y[i][1])/(x[i][0] - x[i][1]) == (y[i][2] - y[i][3])/(x[i][2] - x[i][3])?"YES":"NO"); 
		}
	}

}