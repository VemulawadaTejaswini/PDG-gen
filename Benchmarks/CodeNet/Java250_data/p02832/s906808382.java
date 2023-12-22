import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++)a[i]=sc.nextInt()-1;//0index
		sc.close();
		
		int now = 0;
		int cnt = 0;
		
		for(int i=0;i<N;i++) {
			if(a[i]!=now)cnt++;
			if(a[i]==now)now++;
		}
		if(now==0)System.out.println(-1);
		else System.out.println(cnt);
		
	}
}
