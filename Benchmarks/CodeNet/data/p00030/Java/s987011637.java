import java.util.*;
public class Main {
	static int sum,N;
	static int bfs(int s,int n,int num){
		int kei=0;
		if(sum==s&&n==N){
			return 1;
		}
		if(n>N)return 0;
		if(num>=9)return 0;
		kei+=bfs(s+num,n+1,num+1);
		kei+=bfs(s,n,num+1);
		return kei;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			N=in.nextInt();
			sum=in.nextInt();
			if(N+sum==0)break;
			System.out.println(bfs(0,0,0));
		}
	}
}