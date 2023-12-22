import java.util.*;
  
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		int c[] = new int[N];
  
		for(int i=0; i<M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for(int i=1; i<=N; i++){
			for(int j=0; j<M; j++){
			if(a[j]==i||b[j]==i)
			c[i-1]++;
			}
		}

		for(int y :c)
		System.out.println(y);
		
		
	}
}



