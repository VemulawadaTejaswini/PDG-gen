import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		if (Integer.parseInt(S.substring(5, 7))>4) {
			System.out.println("TBD");
		} else if (Integer.parseInt(S.substring(5, 7))<4) {
			System.out.println("Heisei");
		} else {
			if (Integer.parseInt(S.substring(8))<=30) {
				System.out.println("Heisei");
			} else {
				System.out.println("TBD");
			}
		}
		 
	}

}
