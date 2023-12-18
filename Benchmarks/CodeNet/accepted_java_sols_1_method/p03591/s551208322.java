import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		if(S.length() < 4) {
			System.out.println("No");
			return;
		}
		if(S.substring(0, 4).equals("YAKI")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}