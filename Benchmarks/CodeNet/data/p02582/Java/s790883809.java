import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] cs = S.toCharArray();

		int n = 0;
		for(int i=0; i<3; i++) {
			if(cs[i]=='R') {
				n++;
			}
		}

		if(n==2 && cs[1]=='S') {
			n=1;
		}

		System.out.println(n);


	}

}
