import java.util.Scanner;

public class Main {

	static int N,A,B,C,X;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){
			N=sc.nextInt();
			A=sc.nextInt();
			B=sc.nextInt();
			C=sc.nextInt();
			X=sc.nextInt();
			if(N+A+B+C+X==0)break;
			int[] y = new int[N];
			for(int i=0;i<N;i++){
				y[i]=sc.nextInt();
			}
			int xx=X;
			int cnt=0;
			int now=0;
			for(;cnt<=10000;){
//				System.out.println(N+" "+now);
				if(xx==y[now]){
					now++;
				}
				if(now==N)break;
				xx=(A*xx+B)%C;
				cnt++;

			}
			if(cnt==10001){
				System.out.println(-1);
			}
			else{
				System.out.println(cnt);
			}
		}
	}

}