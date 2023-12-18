import java.util.Scanner;


public class Main {
	static int count(int  n,int i,int cnt) {
		for(int j=i;j<=n;j++) {
			if(n >= j)n -= j;
			if(n==0) return 1;
			else if(n < j+1) return 0;
			count(n-j,j+1,cnt);
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0)break;
			int cnt = 0;
			
			for(int i=1;i<n;i++) {
				cnt += count(n-i,i+1,cnt);
			}
			
			System.out.println(cnt);
		}
		
	}
}
