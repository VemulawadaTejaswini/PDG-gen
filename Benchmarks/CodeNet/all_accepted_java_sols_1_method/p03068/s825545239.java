import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N,K;
		String S;
		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();
		S=sc.next();
		K=sc.nextInt();

		for(int i=0;i<N;i++) {
			if(S.charAt(i)==S.charAt(K-1)) {
				System.out.print(S.charAt(i));
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
		sc.close();
	}

}