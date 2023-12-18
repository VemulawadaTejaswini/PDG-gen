import java.util.Scanner;
class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
				
		if(W >= x + r && x - r >= 0 && H >= y + r && y - r >= 0){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}