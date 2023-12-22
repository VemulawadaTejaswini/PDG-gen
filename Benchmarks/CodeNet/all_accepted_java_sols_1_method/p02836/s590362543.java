import java.util.Scanner;

public class Main {
	static int p[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int h = (int) Math.ceil((double)s.length/2);

		int c = 0;
		for(int i = 0; i+h < s.length; i++) {
			if(s[i] != s[s.length - i-1])
				c++;
		}

		System.out.println(c);

        return;
    }
}

