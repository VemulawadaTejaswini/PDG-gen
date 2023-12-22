import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k;
		String str;
		char[] ch;
		char c;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		sc.nextLine();
		str = sc.nextLine();
		ch = str.toCharArray();
		c = ch[k-1];
		switch (c){
			case 'A':
				c = 'a';
			break;
			case 'B':
				c = 'b';
			break;
			case 'C':
				c = 'c';
			break;
		}
		ch[k-1] = c;

		System.out.println(String.valueOf(ch));
	}
}
