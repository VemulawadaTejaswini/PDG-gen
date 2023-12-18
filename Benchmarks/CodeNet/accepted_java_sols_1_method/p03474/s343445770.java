import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt();
		String s = scanner.next();
		if(s.charAt(a) != '-' || s.length() != (a + b + 1)){
			System.out.println("No");
			return;
		}
		String left = s.substring(0, a);
		String right = s.substring(a+1, a+b+1);
		String regex = "[0-9]*";
		if(left.matches(regex) && right.matches(regex)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
