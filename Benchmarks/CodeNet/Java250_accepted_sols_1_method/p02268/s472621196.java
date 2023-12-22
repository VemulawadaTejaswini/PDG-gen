import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for(int i=0; i<n; i++){
			s[i] = sc.nextInt();
		}
		int p = sc.nextInt();
		int ans = 0;
		for(int i=0; i<p; i++){
			int q = sc.nextInt();
			int upp = n - 1;
			int low = 0;
			int mid = (upp + low) / 2;
			while(low<=upp){
				if(s[mid]==q){
					ans++;
					break;
				}
				else if(s[mid]<q){
					low = mid + 1;
					mid = (low + upp) / 2;
				}
				else{
					upp = mid - 1;
					mid = (low + upp) / 2;
				}
			}
		}
		System.out.println(ans);
	}
}
