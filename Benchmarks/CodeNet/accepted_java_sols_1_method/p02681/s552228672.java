import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bl = true;
		char s[] = sc.next().toCharArray();
		char t[] = sc.next().toCharArray();
		for(int i = 0; i < s.length; i++) {
			if(s[i] != t[i])
				bl = false;
		}
		if(bl && s.length < t.length)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
