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
		int c = scanner.nextInt();
		
		if(a < b && b < c){
			System.out.println("Yes");
			}
			else {
			System.out.println("No");
			}
		
		}

}