import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N,K;
		String S;
		Scanner sc=new Scanner(System.in);	
		N=sc.nextInt();
		S=sc.next();
		K=sc.nextInt();
		
		String temp=S.substring(K-1,K);
		for(int i=0;i<N;i++) {
			if(!S.substring(i,i+1).equals(temp)) {
				S=S.replace(S.substring(i,i+1), "*");
			}
		}
			
		System.out.println(S);
	}
}
