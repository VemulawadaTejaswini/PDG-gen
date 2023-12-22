import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	static int N,M,k;
	static int[] a,b;
	static int[][] f;
	static String s;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		N = sc.nextInt();
		b=new int[N];
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		int cnt=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<a.length;i++){
			if(i>0 && a[i]==a[i-1])continue;
			for(int j=0;j<b.length;j++){
				if(j>0&&b[j]==b[j-1])continue;
				if(a[i]==b[j])cnt++;
			}
		}
		System.out.println(cnt);

	}

}