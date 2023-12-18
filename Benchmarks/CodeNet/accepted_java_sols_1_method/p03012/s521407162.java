import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int W[]=new int[N];
		int S[]=new int[2];
		int result=0;
		for(int i=0;i<N;i++) {
			W[i]=sc.nextInt();
			result+=W[i];
		}
		sc.close();
		for(int T=0;T<(N-1);T++){
			S[0]=S[1]=0;
			for(int k=0;k<=T;k++) {
				S[0]+=W[k];
			}
			for(int l=T+1;l<=(N-1);l++) {
				S[1]+=W[l];
			}
			if(Math.abs(S[0]-S[1])<result) {
				result=Math.abs(S[0]-S[1]);
			}
		}
		System.out.println(result);
	}
}