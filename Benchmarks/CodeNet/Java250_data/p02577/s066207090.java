import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int total = 0;
		for (int i = 0;i< n.length();i++) {
			total += Integer.parseInt(Character.toString(n.charAt(i)));
		}
		if(total % 9 ==0) {
			System.out.print("Yes");
		}else {

			System.out.print("No");
		}
		
	}

}