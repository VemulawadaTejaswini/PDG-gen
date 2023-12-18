import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		long K=scan.nextLong();
		long A[]=new long[N];
		long B[]=new long[M];
		for(int i=0;i<A.length;i++) {
			A[i]=scan.nextInt();
		}
		for(int i=0;i<B.length;i++) {
			B[i]=scan.nextInt();
		}
		int len=A.length+B.length;
		long []hoge=new long[len];
		System.arraycopy(A,0,hoge,0,A.length);
		System.arraycopy(B,0,hoge,A.length,B.length);

		Arrays.sort(hoge);
		int sum=0;
		for(int i=0;i<len;i++) {
			if(hoge[i]>K) break;
			if(K-hoge[i]>=0) {
					K-=hoge[i];
					sum+=1;
					}else {
					break;
			}
		}

		System.out.println(sum);

	}
}
