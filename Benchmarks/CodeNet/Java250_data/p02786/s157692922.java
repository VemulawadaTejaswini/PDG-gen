import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long h = sc.nextLong();
			
			
			System.out.println(countTurn(h));

		}
			
	}
	
	static private long countTurn(long hp) {
		
		if ( hp == 1 ) {
			return 1;
		}
		else {
			return 2 * countTurn(hp / 2) + 1;
		}
	}
}