import java.util.*;

public class Main{
	public static int b[];
	public static int N;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	int a[] = new int[N];
	for(int i=0;i<N;i++) a[i]=sc.nextInt();
	sc.close();
	b = new int[N];
	for(int i=0;i<N;i++) b[i]=0;//initialized
	
	for(int i=N;i>0;i--) {
			int cnt = 0;
			for(int j=2;j<=(N/(i));j++) {
				if(b[i*j-1]==1)cnt++;
			}
			if(cnt%2!=a[i-1])b[i-1]++;
	}
	
	StringBuilder sb = new StringBuilder();
	int cnt = 0;
	for(int i=0;i<N;i++) {
		if(b[i]==1) {
			sb.append(i+1+ " ");
			cnt ++;
		}
	}
	System.out.println(cnt);
	System.out.println(sb.toString());		
	}
}