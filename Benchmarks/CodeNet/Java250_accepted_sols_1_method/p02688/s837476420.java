import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int D = 0;
		int A = 0;
		
		
		int ans[]=new int[N+1];
		int anss = 0;
		
		for(int i=1;i<=K;i++){
			D = sc.nextInt();
			for(int j=1;j<=D;j++){
				A = sc.nextInt();
				ans[A]=1;	
			}
		}

		for(int k=1;k<=N;k++){
			if (ans[k]!=1) {
			anss=anss+1;
			}
		}

		System.out.println(anss);
    }
}