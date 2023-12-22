import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n+1];
		int k = sc.nextInt();
		for(int i=0; i<k; i++){
			int d = sc.nextInt();
			for(int j=0; j<d; j++) {
				int t = sc.nextInt();
				ary[t] = 1;
			}
		}
		int ans = 0;
		for(int i=1; i<ary.length; i++){
			if(ary[i]==0){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
