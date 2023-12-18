import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		String S = sc.next();

		sc.close();

		char last = '0';
		int count = 0;
		for(int i = 0;i < N;i++) {
			if(last == S.charAt(i)) {

			}else {
				count++;
				last = S.charAt(i);
			}
		}


		System.out.println(count);


	}
}
