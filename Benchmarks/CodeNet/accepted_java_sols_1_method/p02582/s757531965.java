import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int ans = 0;
		int value = 0;
		for(int i=0; i<3; i++) {
			if(S.charAt(i) == 'R') {
				value++;
				ans = Math.max(ans, value);
			}else {
				value = 0;
			}
		}

		System.out.println(ans);

	}


}
