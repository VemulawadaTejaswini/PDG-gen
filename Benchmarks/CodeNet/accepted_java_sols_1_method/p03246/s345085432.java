
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		for(int i=0;i<n;i++)v[i] = sc.nextInt();
		int cnt0[] = new int[100010];
		int cnt1[] = new int[100010]; 
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				cnt0[v[i]]++;
			}
			else {
				cnt1[v[i]]++;			}
		}
		int max0_1 = 0, max1_1 = 0;
		int max0_2 = 0, max1_2 = 0;
		
		int max0_1v = 0, max1_1v = 0;
		int max0_2v = 0, max1_2v = 0; //これ不要だった。教訓で残しておく
		
		for(int i=0;i<cnt0.length;i++) {
			if(max0_1<=cnt0[i]) {
				max0_2=max0_1;
				max0_1=cnt0[i];
				
				max0_2v = max0_1v; 
				max0_1v = i; 
				
			}else if(max0_2<=cnt0[i]) {
				max0_2=cnt0[i];
				max0_2v = i; 

			}
			if(max1_1<cnt1[i]) {
				max1_2=max1_1;
				max1_1=cnt1[i];

				max1_2v = max1_1v; 
				max1_1v = i; 

			}else if(max1_2<=cnt1[i]) {
				max1_2=cnt1[i];
				max1_2v = i; 
			}
		}
		
		int ans = 0;
		
		if(max0_1v!=max1_1v) {
			ans = n - max0_1 - max1_1;
		}
		else {
			int tmp1 = n - max0_1 - max1_2;
			int tmp2 = n - max0_2 - max1_1;
			ans = Math.min(tmp1, tmp2);
		}
		System.out.println(ans);
		
		
	}
}

