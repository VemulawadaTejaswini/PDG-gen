import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		if (a.charAt(2) == a.charAt(3) && a.charAt(4) == a.charAt(5)) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
		
    }
}