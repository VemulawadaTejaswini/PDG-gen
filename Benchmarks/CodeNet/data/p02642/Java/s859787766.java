import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = scan.nextLong();

		}
		int ans = 0;
		for(int i=0; i<n; i++){
			boolean flag = true;
			for(int j=0; j<n; j++){
				if(i != j){
					if(a[i] % a[j] == 0) flag =false;
				}
			}
			if(flag){
				ans ++;
			}
		}
		System.out.println(ans);

	}

}