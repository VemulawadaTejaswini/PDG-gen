import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] h=new int[200001];
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			h[a]++;
			hs.add(a);
		}
		Arrays.sort(h);
		int ans=0;
		int cnt=hs.size()-k;
		for(int i=0;i<h.length;i++) {
			if(cnt<=0) {
				break;
			}else if(h[i]==0) {
				continue;
			}
			ans+=h[i];
			cnt--;
		}
		System.out.println(ans);
	}
}
