import java.util.Scanner;
 class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int S = scanner.nextInt();
					
		System.out.println(S/3600+":"+(S%3600)/60+":"+(S%3600)%60);
		
	}

}