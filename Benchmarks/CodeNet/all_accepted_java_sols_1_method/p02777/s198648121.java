import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner kbs = new Scanner(System.in);
		String S = kbs.next();
		String T = kbs.next();
		int A = kbs.nextInt();
		int B = kbs.nextInt();
		String U = kbs.next();
		if(U.equals(S)){
			A -= 1;
		}
		if(U.equals(T)){
			B -= 1;
		}
		System.out.printf("%d %d\n", A,B);
		kbs.close();
	}

}
