import java.util.Scanner;
 class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a < b){
			System.out.println("a < b");
		}
		else if(a > b){
			System.out.println("b < a");
		}
		else {
			System.out.println("a == b");
		}
		
	}

}