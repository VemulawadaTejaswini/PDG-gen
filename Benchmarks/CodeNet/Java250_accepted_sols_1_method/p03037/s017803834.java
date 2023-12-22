import java.util.Scanner;



public class Main {
	//C - Prison


	public static void main(String[] args){
		int N;int M;
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();

		boolean[]Ans=new boolean[N+1];
		for(int i=0;i<N+1;i++) {
			Ans[i]=true;
		}
		for(int i=0;i<M;i++) {
			int L=sc.nextInt();
			int R=sc.nextInt();
			for(int j=0;j<L;j++) {
				Ans[j]=false;
			}
			for(int j=R+1;j<N+1;j++) {
				Ans[j]=false;
			}
		}
		int num=0;
		for(int i=0;i<N+1;i++) {
			if(Ans[i])num++;
		}
		System.out.println(num);


	}
}