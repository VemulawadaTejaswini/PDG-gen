import java.util.Scanner;

public class Main {
	
	static int maxA = (int)1e5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
		sc.close();
		
		int num[] = new int[maxA];
		
		for(int i=0;i<N;i++) num[A[i]]++;
		
		int cnt = 0;
		int dec = 0;
		for(int i=0;i<maxA;i++) {
			if(num[i]==0)continue;
			dec += (num[i]-1);
			cnt++;
		}
		
		int ans = 0;
		if(dec%2==0) ans = cnt;
		else ans = cnt - 1;
		
		System.out.println(ans);
	}
}
