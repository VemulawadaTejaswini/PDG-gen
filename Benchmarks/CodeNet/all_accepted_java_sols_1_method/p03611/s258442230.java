import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] cnt = new int[100005];
		for(int i=0;i<n;i++) {
			cnt[sc.nextInt()]++;
		}
		
		int max = 0;
		for(int i=0;i<cnt.length-2;i++) {
			int c = cnt[i]+cnt[i+1]+cnt[i+2];
			
			if(c>max)
				max = c;
		}
		
		System.out.println(max);
	}
}
