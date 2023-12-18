import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while( sc.hasNext() ) {
			String line = sc.nextLine();
			for(char ch : line.toCharArray()) {
				System.out.print( Character.toUpperCase(ch) );
			}
			System.out.println();
		}
		
	}

}