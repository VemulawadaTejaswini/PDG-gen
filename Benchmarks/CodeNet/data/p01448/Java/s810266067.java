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
				}//範囲に入るOKな人の数
			}
			for(int i=2; i<=100001; i++) {
					if(i<=d[i]) {
					max=Math.max(i, max);
					}
					else {
						max=Math.max(d[i], max);
					}
			}
			if(max==0) max=1;
			System.out.println(max-1);
		}
	}
}
