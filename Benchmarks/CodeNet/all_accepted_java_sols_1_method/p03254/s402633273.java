import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int x = Integer.parseInt(scan.next());
		int[] a = new int[n];
		for(int i = 0;i < n; ++i){
			a[i] = Integer.parseInt(scan.next());
		}
		Arrays.sort(a);
		int ans = 0;
		for(int i = 0;i < n; ++i){
			if (a[i] <= x){
				++ans;
				x-=a[i];
				if(i == n-1 && x != 0){
					--ans;
				}
			}else{
				break;
			}
		}
		System.out.println(ans);

	}

}


//end