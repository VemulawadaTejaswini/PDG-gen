
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int i=0;i<n;i++){
			s[i] = in.nextInt();
		}
		int q = in.nextInt();
		int[] t = new int[q];
		for(int i=0;i<q;i++){
			t[i] = in.nextInt();
		}
		int count = 0;
		for(int i=0;i<q;i++){
			int ul = s.length;
			int ll = -1;
			boolean flag = false;
			while(ll+1<ul){
				int mid = (ll+ul)/2;
				if(s[mid] == t[i]){
					flag = true;
					break;
				}
				else if(s[mid]<t[i]){
					ll = mid;
				}
				else{
					ul = mid;
				}
			}
			if(flag){
				count++;
			}
		}
		System.out.println(count);
	}
}