import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int w = sc.nextInt();
			int q = sc.nextInt();
			if((n|s|w|q) == 0) break;
			char[] a = create(s, w, n);
			int ans = 0;
			if(q == 2 || q == 5){
				int count = 0;
				for(int i = 0; i < n; i++){
					if( (int)(a[i] - '0') % q == 0){
						if((int)(a[i] - '0') != 0){
							count++;
						}
						ans += count;
					}
				}
			}
			else{
				int [] freq = new int[q + 1];
				freq[0] = 1;
				int digitUp = 1;
				int now = 0;
				for(int i = n - 1; i >= 0; i--){
					now = ((int)(a[i] - '0') * digitUp + now) % q;
					digitUp = (digitUp * 10) % q;
					if(a[i] != '0'){
						ans += freq[now];
					}
					freq[now]++;
				}
			}
			System.out.println(ans);
		}
	}

	private char[] create(int s, int w, int n) {
		char [] a = new char[n];
		int g = s;
		for(int i = 0; i < n; i++){
			a[i] = (char) (((g / 7) % 10) + '0');
			if(g % 2 == 0){
				g = (g / 2);
			}
			else{
				g = (g / 2) ^ w;
			}
		}
		return a;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}