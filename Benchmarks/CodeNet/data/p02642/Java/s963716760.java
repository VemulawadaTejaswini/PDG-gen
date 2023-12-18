import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] as = new int[n];
		int[] count = new int[1000001];
		boolean[] hantei = new boolean[1000001];
		for(int i=0; i<n; i++){
			as[i] = sc.nextInt();
			count[as[i]]++;
		}
		for(int i=0; i<n; i++){
			if(count[as[i]] >= 2){
				int j = 2;
				int tmp = as[i];
				while(tmp <= 1000000){
					hantei[tmp] = true;
					tmp = as[i]*j;
					j++;
				}
			} else if(count[as[i]] >= 1){
				int j = 2;
				int tmp = as[i]*j;
				while(tmp <= 1000000){
					hantei[tmp] = true;
					j++;
					tmp = as[i]*j;
				}
			}
		}
		int ans = 0;
		for(int a: as){
			if(!hantei[a]) ans++;
		}
		System.out.println(ans);

	}
}
