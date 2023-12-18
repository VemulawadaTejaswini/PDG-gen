import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ans = 0;
		int n = scan.nextInt();
		int m = scan.nextInt();
		int p[] = new int [m];
		List<Integer>[] button = new ArrayList[n];
		for(int i=0;i<n;i++) {
			button[i] = new ArrayList<>();
		}
		
		for(int i=0;i<m;i++) {
			int k = scan.nextInt();
			for(int j=0;j<k;j++) {
				int s = scan.nextInt()-1;
				button[s].add(i);
			}
		}
		
		
		for(int i=0;i<m;i++) {
			p[i] = scan.nextInt();
		}
		
		for(int i=0;i<(1<<n);i++) {
			int on[] = new int[m];
			boolean check = true;
			for(int j=0;j<n;j++) {
				if((1 & i>>j)==1) {
					for(int l : button[j]) {
						on[l] += 1;
					}
				}
			}
			
			
			for(int j=0;j<m;j++) {
				if(on[j]%2 != p[j]) {
					check = false;
					break;
				}
			}
			
			if(check) {
				ans += 1;
			}
		}
		
		System.out.println(ans);
		
		
		
	}	
}
 