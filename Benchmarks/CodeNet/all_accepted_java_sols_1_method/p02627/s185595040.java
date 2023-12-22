import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String n=sc.next();
		if(Character.isUpperCase(n.charAt(0))) {
			System.out.println("A");
		}
		else System.out.println("a");
	}
}