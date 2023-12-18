import java.util.Scanner;
class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int S = scanner.nextInt();
		int h = scanner.nextInt();
		int m = scanner.nextInt();
					
		System.out.println(S/h+":"+(S%h)/m+":"+(S%h)%m);
		
	}

}