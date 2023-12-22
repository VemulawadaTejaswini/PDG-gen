import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n; ++i) a[i] = scan.nextInt();
	
		int[] count = new int[1000001];
		for(int i:a){
			if(count[i] != 0){
				count[i] = 2;
				continue;
			}

			for(int j = i;j <= 1000000; j +=i){
				++count[j];
			}
		}
		int ans = 0;
		for(int i : a){
			ans += (count[i] == 1?1:0);
		}
		System.out.print(ans);
	}
}

