import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int pi[]=new int[n];
		for(int i=0;i<n;i++) {
			pi[i]=sc.nextInt();
		}
		int c=0;
		for(int i=1;i<n-1;i++) {
			int p[] = new int[] {pi[i-1],pi[i],pi[i+1]};
			int min= Math.min(Math.min(p[0], p[1]), p[2]);
			if(min==p[1]) {
				continue;
			}
			if(p[0]==min)p[0]=Integer.MAX_VALUE;
			if(p[2]==min)p[2]=Integer.MAX_VALUE;

			int min2= Math.min(Math.min(p[0], p[1]), p[2]);
			if(min2==p[1])c++;
		}
		System.out.println(c);


	}
}