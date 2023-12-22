import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){ 
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		
		if ( H == 0 && W == 0 ){
			break;
			}
			else{
				int smallh;
				int smallw;
				
				for( smallh = 0; smallh < H; smallh++  ) {
					
					
					for( smallw = 0; smallw < W; smallw++ ) {
					System.out.print("#");
					}
					System.out.println();
				}
			}
		System.out.println();
		}
	}
}