import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		if (T.substring(0, T.length()-1).equals(S)) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
    }
}
