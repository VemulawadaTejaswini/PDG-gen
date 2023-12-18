import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextDouble() ) {
			double y = Math.pow(( scan.nextDouble() / 9.8), 2) * 4.9;
			int i;
			for(i = 1; ; i++ ) {
				if( ( y - (5*i-5) ) < 0 ) {
					break;
				}
			}
			
			System.out.println(i);
		}
	}
}