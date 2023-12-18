import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int f = 0;
		for(int i = 0; i < n.length(); i++) {
			f += n.charAt(i) - '0';
		}
		if(Integer.parseInt(n) % f == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
