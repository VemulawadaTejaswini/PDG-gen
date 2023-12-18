import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		while( true ) {
			int height	= sc.nextInt();
			int width	= sc.nextInt();
			
			if ( height	== 0 &&	width	== 0 ) break;
			
			for (int i = 0; i < height; i++ ) {
				if( ( i % 2 ) == 0 ) {
					even( width );
					
				} else {
					odd( width );
					
				}
				
			}
			
			System.out.print("\n");
			
		}
	}

	public static void even( int width ) {
		for (int i = 0; i < width; i++ ) {
			if( ( i % 2 ) == 0 ) {
				System.out.print("#");

			} else {
				System.out.print(".");
				
			}

		}
		
		System.out.print("\n");

	}
	
	public static void odd( int width ) {
		for (int i = 0; i < width; i++ ) {
			if( ( i % 2 ) == 0 ) {
				System.out.print(".");

			} else {
				System.out.print("#");
				
			}

		}
		
		System.out.print("\n");
	}
	
	
}