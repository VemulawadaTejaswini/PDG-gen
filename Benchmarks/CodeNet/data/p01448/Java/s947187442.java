import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N=sc.nextInt();
			int a, b;
			int[] d=new int[100010];
			int max=0;
			//System.out.println(N);
			for(int i=1; i<=N; i++) {
				a=sc.nextInt();
				b=sc.nextInt();
				for(int j=a; j<=b; j++) {
					d[j]++;
					max=Math.max(d[j], max);
				}//範囲に入るOKな人の数
			}
			//System.out.println(max);
			int ansmax=0;
			//System.out.println(N+1);
			for(int i=2; i<=N+1; i++) {
				//System.out.println(d[i]);
				if(d[i]==max) {
					ansmax=Math.max(i, ansmax);
				}
				
			}
			if(ansmax==0) ansmax=1;
			System.out.println(ansmax-1);
		}
	}
}

