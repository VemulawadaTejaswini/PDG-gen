import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] V=new int[N];
		int[] C=new int[N];
		int[] X=new int[N];
		for(int i=0;i<N;i++)V[i]=sc.nextInt();
		for(int i=0;i<N;i++)C[i]=sc.nextInt();
		sc.close();
		for(int i=0;i<N;i++){
			X[i]=V[i]-C[i];
		}
		int ans=0;
		for(int i=0;i<X.length;i++){
			if(X[i]>0)ans +=X[i];
		}
		System.out.println(ans);
	}
}