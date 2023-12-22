
public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String original = sc.next();
		String to_reverse = "";
		
		for (int i = original.length() - 1; i >= 0; i--) {
			to_reverse += original.charAt(i);
		}
		
		System.out.println(to_reverse);
	}

}