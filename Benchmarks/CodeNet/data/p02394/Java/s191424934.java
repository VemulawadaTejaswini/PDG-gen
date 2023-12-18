public class Main {
	
		
		public static void main(String[] args) {
			java.util.Scanner scan = new java.util.Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		if( W >= (x + r) && H >= (y + r)){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
		
		}
		
		
		
		}