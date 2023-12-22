import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String S, T;
		int count= 0;
		Scanner scan = new Scanner(System.in);
		S=scan.nextLine();
		T=scan.nextLine();
		for (int i= 0; i<S.length();i++) {
			if(S.charAt(i)==T.charAt(i)) {
				++count;
			}
		}
		System.out.println(count);

	}

}