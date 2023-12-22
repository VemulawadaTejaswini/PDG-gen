import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String[] s = sc.next().split("");
		if(s.length != a+ b +1) {
			System.out.println("No");
			return;
		}
		for(int i = 0;i < a + b + 1;i++) {
			if(i == a) {
				if(!s[i].equals("-")) {
					System.out.println("No");
					return;

			}}else {
				try {
					Integer.parseInt(s[i]);
				}catch(Exception e) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

}