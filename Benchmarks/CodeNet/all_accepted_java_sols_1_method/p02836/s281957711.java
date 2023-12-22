import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sz = str.length(), count = 0;
		for (int i=0 ; i<sz/2 ; i++) {
			if(str.charAt(i) != str.charAt(sz-i-1)) count++;
		}
		System.out.println(count);
	}
}