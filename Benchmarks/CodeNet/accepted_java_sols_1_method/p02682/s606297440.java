

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int K=sc.nextInt();
		int ans=0;
		int K1=0;
		int K2=0;



		if(K>A) {
			ans=ans+1*A;
			K1=K-A;
		}else {
			ans=ans + 1*K;
		}
		if(K1>B) {
			ans=ans+B*0;
			K2=K1-B;
		}else {
			ans=ans + 0*K1;
		}
		if(K2>C) {
			ans=ans+C*(-1);
		}else {
			ans=ans+K2*(-1);
		}
		System.out.println(ans);

		sc.close();

	}
}
