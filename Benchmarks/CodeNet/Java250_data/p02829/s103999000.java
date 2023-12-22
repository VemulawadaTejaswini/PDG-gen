import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
		
			int[] ans = new int[3];
			
			ans[sc.nextInt() - 1 ]  = 1;
			ans[sc.nextInt() - 1 ] = 1;
			
			for(int i = 0 ; i < 3 ; i++ ) {
				if ( ans[i] == 0 ) {
					System.out.println(i+1);
				}
			}

		}
	}

}