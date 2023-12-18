import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		for(int i = S.length() - 1; i > 0; i--) {
			String T = S.substring(0, i);
			if(T.length() % 2 == 0) {
				String former = T.substring(0, T.length() / 2);
				String latter = T.substring(T.length() / 2, T.length());
				if(former.equals(latter)) {
					System.out.println(T.length());
					return;
				}else {
					continue;
				}
			}else {
				continue;
			}
		}
	}

}