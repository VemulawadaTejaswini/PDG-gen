import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String t = in.nextLine();
		
		for(int i=0;i<t.length();i++){
			System.out.print(t.charAt(i));
			if(i==3)
				System.out.print(" ");
		}
		System.out.println();
	}

}
