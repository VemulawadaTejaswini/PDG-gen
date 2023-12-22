import java.util.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] x = new String[N];
		for(int i=0;i<N;i++){
			x[i] = sc.next();

		}
		int M = sc.nextInt();
		String [] y = new String[M];
		for(int i=0;i<M;i++){
			y[i] = sc.next();

		}
		String [] z = new String[N+M];
		for(int i=0;i<N;i++){
			z[i] = x[i];
			
		}
		for(int i=0;i<M;i++){
			z[N+i] = y[i];
		}
		int max = 0;

		for(String str:z){
			int ans = 0;
			for(int i=0;i<N;i++){
				if(str.equals(x[i])){
					ans ++;
				}

			}
			for(int i=0;i<M;i++){
				if(str.equals(y[i])){
					ans --;
				}

			}
			max = Math.max(max,ans);
		}
		System.out.println(max);


		


	}
}