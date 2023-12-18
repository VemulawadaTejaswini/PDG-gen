import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		int judge = 0;

		if(S.charAt(A) != '-') {
			judge += 1;
		}

		for(int i=0; i<A; i++) {
				if(S.charAt(i) == '-') {
					judge += 1;
				}
		}

		for(int j=0; j<B; j++) {
			if(S.charAt(A+1+j) == '-') {
				judge += 1;
			}
		}

		if(judge == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
