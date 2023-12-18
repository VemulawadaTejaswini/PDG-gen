import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N=sc.nextInt();
			int[] a=new int[N+1];
			int[] b=new int[N+1];
			int[] d=new int[100010];
			int max=0;
			for(int i=1; i<=N; i++) {
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
				for(int j=a[i]; j<=b[i]; j++) {
					d[j]++;
				}
			}
			for(int i=2; i<=100001; i++) {
				if(d[i]==N) {
					max=Math.max(i, max);
				}
			}
			if(max>N) max=1;
			System.out.println(max-1);
		}
	}
}

