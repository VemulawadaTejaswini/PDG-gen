import java.util.Scanner;
public class Main{
	static int left(int x,int[] fee) {
		int cnt = 0;
		
		for(int i = x; i >= 0; i--) {
			for(int j = 0; j < fee.length;j++)
			if(i == fee[j]) {
				cnt++;
			}
		}
		return cnt;
	}
	static int right(int x,int n,int[] fee) {
		int cnt = 0;
		
		for(int i = x; i <=n+1; i++) {
			for(int j = 0; j < fee.length;j++)
				if(i == fee[j]) {
					cnt++;
				}
		}
		return cnt;
	}
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //マスの数-1
		int m = stdIn.nextInt(); //料金所の数
		int x = stdIn.nextInt(); //今いるマスの場所
		
		int [] fee = new int[m];
		for(int i = 0; i < m; i++) {
			fee[i] = stdIn.nextInt();
		}
		int a = left(x,fee)<right(x,n,fee)?left(x,fee):right(x,n,fee);
		System.out.println(a);
		
		
		
		
		
	}

}
