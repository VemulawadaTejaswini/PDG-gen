import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] t = new int[N+1];
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		
		
		for(int i = 1 ; i < N+1 ; i++){
			t[i] = scan.nextInt();
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}	
		
		int distance = 0;
		
		for(int i = 0 ; i < N ; i++){ 
			distance = Math.abs(x[i]-x[i+1]) + Math.abs(y[i]-y[i+1]);
			if (distance > t[i+1] -t[i]){
				System.out.println("No");
				return;
			}
			if ( (distance-(t[i+1]-t[i]))%2 != 0){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		
		
	}
}