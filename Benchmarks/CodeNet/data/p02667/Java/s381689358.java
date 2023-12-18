import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] T = sc.next().toCharArray();
		int N = T.length;
		
		int odd = 0;
		int even = 0;
		for(int i=0; i<N; i++) {
			if(T[i]=='1') {
				if(i%2==0)
					odd++;
				else
					even++;
			}
		}
		
		long ans = odd;
		int remove = 0;
		for(int i=0; i<N-remove; i++) {
			if((i+remove)%2==0) {
				if(T[i]=='1') {
					odd--;
				} else {
					int temp = odd;
					odd = even;
					even = temp;
					ans += odd + (i-remove+1)/2;
					remove++;
				}
				
			} else {
				if(T[i]=='1') {
					even--;
				}
			}
		}
		
		for(int i=N-remove-1; i>=1; i--) {
			ans += (i+1)/2;
		}
		
		System.out.println(ans);
		sc.close();
	}

}

