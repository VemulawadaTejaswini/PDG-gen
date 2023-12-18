import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int tot = 0;
		for(int i = 0 ; i < n.length() ; i++) {
			tot += Integer.valueOf(String.valueOf(n.charAt(i)));
		}
		if(Integer.valueOf(n) % tot == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}