public class Main {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		while(true) {
			c = c - b;
			if (c<=0) {
				System.out.println("Yes");
				break;
			}
			a = a - d;
			if(a<=0) {
				System.out.println("No");
				break;
			}
		}
		
	
	}
}
