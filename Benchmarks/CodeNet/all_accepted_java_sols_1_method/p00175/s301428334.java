import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		while(true) {
			n = scan.nextInt();
			
			if(n == -1) break;
			
			System.out.println(Integer.toString(n, 4));
		}
		
		scan.close();
	}
}