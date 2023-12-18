import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt() - 1;
		String s = sc.next();
		char[] ca = s.toCharArray();
		switch (ca[k]){
			case 'A':
				ca[k] = 'a';
				break;
			case 'B':
				ca[k] = 'b';
				break;
			case 'C':
				ca[k] = 'c';
		}
		String ans = new String(ca);
		System.out.println(ans);
	}
}
