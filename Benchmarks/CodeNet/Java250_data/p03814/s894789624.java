import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int f = -1; int l = -1;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'A' &&f < 0 ) f = i;
			if (s.charAt(i) == 'Z') l = i;
		}
		System.out.println(l+1-f);
	}
}
