import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int l[] = new int[n];
		for(int i=0;i<n;i++) {
			l[i] = scan.nextInt();
		}
		int ans = 0;
		
		Arrays.sort(l);
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(l[i] != l[j]) {
					for(int k=j;k<n;k++) {
						if(l[j] != l[k]) {
							int oppai = l[j] - l[i];
							int boin = l[j] + l[i];
							oppai = Math.abs(oppai);
							if(oppai < l[k] && l[k] < boin) {
								
								ans++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 



