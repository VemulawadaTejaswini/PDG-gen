import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		int s = 0;
		for(int i=0; i<K; i++) {
			if(A>0) {
				A--;
				s++;
			}else if(B>0) {
				B--;
			}else if(C>0) {
				C--;
				s--;
			}
		}
		System.out.println(s);
	}

}