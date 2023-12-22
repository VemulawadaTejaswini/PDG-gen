import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		int border = A + B;
		int countOK = 0;
		int countForeignr = 0;

		for(int i = 1; i <= N; i++) {
			char tmp = S.charAt(i - 1);
			if(tmp == 'a') {
				if(countOK < border) {
					System.out.println("Yes");
					countOK++;
				}else {
					System.out.println("No");
				}
			}else if(tmp == 'b') {
				countForeignr++;
				if(countOK < border && countForeignr <= B) {
					System.out.println("Yes");
					countOK++;
				}else {
					System.out.println("No");
				}
			}else {
				System.out.println("No");
			}
		}
	}

}
