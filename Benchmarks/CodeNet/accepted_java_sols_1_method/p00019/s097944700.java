import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long a=1;
		
		for(int i=n; i>=1; i--){
			a*=i;
		}
		System.out.println(a);
	}
}