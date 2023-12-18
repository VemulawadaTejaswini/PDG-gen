import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			if(str.equals("-")) {
				break;
			}
			
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				int n = sc.nextInt();
				str = str.substring(n, str.length()) + str.substring(0, n);
			}
			
			System.out.println(str);
		}
	}
}
