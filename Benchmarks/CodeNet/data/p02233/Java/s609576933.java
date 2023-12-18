import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int f = 1;
		
		if(n > 1) {
			int f1 = 1;
			int f2 = 1;
			f = 0;
			
			for(int i = 1; i < n; i++) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}
		}
		
		System.out.println(f);
	}

}