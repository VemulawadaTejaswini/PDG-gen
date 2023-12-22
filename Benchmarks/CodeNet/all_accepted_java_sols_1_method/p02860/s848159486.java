import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String[] S = sc.next().split("");
		String T1="",T2="";

		if(N%2==0) {
			for(int i=0;i<N/2;i++) {
				T1+=S[i];
				T2+=S[i+N/2];
			}
			System.out.println(T1.equals(T2)?"Yes":"No");
		}else {
			System.out.println("No");
		}
	}
}
