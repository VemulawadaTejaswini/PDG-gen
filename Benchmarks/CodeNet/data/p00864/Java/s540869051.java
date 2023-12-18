import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int w = sc.nextInt();
			if(n+w==0)break;
			int[] cnt = new int[100];
			for (int i = 0; i < n; i++) {
				cnt[sc.nextInt()/w]++;
			}
			double high=0;
			double max = 0;
			for (int i = 0; i < cnt.length; i++) {
				high=Math.max(high, cnt[i]);
				if(cnt[i]>0){
					max=i;
				}
			}
			double ans = 0.01;
			for (int i = 0; i < cnt.length; i++) {
				if(cnt[i]==0)continue;
				ans += (cnt[i]/high) * ((int)max-i)/(max);
			}
			System.out.println(ans);
		}
	}
}