import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int m = scan.nextInt();
		int n = scan.nextInt();
			
		
		int g = gcd(m, n);
		
		System.out.println(g+" "+(m*n/g));
		
	}
	
	private static int gcd(int a, int b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
}