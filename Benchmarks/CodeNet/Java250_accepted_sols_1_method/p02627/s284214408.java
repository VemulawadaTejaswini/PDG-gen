import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		String X = in.nextLine();

		if((short)X.charAt(0) >= (short)'a') {
			System.out.println('a');
		}else {
			System.out.println('A');
		}
		in.close();
	}
}
