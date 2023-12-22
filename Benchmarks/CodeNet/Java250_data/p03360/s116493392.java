import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
		final int K=sc.nextInt();
		int k=1;
		for(int i=0;i<K;i++){
			k=k*2;
		}
		if(A>B){
			if(A>C){
				A=A*k;
			}else{
				C=C*k;
			}
		}else{
			if(B>C){
				B=B*k;
			}else{
				C=C*k;
			}
		}
		int ans=A+B+C;
		System.out.println(ans);
	}
}
