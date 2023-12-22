import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		
		if(s.charAt(a) == '-') {
		
		}else {
			System.out.println("No");
			return;
		}
		s = s.substring(0, a) + s.substring(a+1);
		for (Character c : s.toCharArray()) {
			if(Character.isDigit(c)) {
				
			}else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		
	}

}