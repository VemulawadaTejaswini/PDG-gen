import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String a = "";
		String t1 = "";
		String t2 = "";
		if(N%2==1) {
			a = "No";
		}else {
			for(int i=0; i<N/2; i++) {
				t1 += S.charAt(i);
			}
			for(int i=N/2; i<N; i++) {
				t2 += S.charAt(i);
			}
			if(t1.equals(t2)) {
				a = "Yes";
			}else {
				a = "No";
			}
		}
		sc.close();
		System.out.println(a);
	}

}