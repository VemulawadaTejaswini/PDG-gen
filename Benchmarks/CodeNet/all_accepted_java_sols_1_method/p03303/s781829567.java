import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int w = sc.nextInt();
		
		for(int i = 0; i < input.length(); i+=w){
			System.out.print(input.charAt(i));
		}
		System.out.println();
	}

}
