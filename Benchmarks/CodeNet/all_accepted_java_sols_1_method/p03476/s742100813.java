import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] prime = new boolean[100001];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for(int i=2;i*i<prime.length;i++){
			if(prime[i]){
				for(int j=i*i;j<prime.length;j+=i){
					prime[j] = false;
				}
			}
		}
		
		int cnt[] = new int[100001];
		
		for(int i=3;i<=100000;i++){
			cnt[i] = cnt[i-1];
			if(prime[i] && prime[(i+1)/2])
				cnt[i]++;
		}
		
		int q = sc.nextInt();
		while(q-->0){
			int l = sc.nextInt(), r = sc.nextInt();
			
			System.out.println(cnt[r] - cnt[l-1]);
		}

	}

}
