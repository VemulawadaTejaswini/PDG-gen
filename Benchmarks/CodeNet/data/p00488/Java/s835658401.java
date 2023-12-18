import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int p = 2000, j = 2000;
		
		for(int i = 0; i < 3; i++){
			n = scan.nextInt();
			if(n < p)p = n;
		}
		for(int i = 0; i < 2; i++){
			n = scan.nextInt();
			if(n < j)j = n;
		}
		
		System.out.println((p + j - 50));
	}
}