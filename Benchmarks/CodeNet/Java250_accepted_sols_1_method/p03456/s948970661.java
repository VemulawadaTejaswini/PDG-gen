import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next() + sc.next();
		int val = Integer.parseInt(str);
		int val2 = (int)Math.sqrt(val);
		if(val == (val2 * val2)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}