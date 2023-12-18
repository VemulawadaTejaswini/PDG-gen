import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		int N = input.nextInt();
		int max = (int)(1e6)+1;
		int[] arr = new int[N];
		int[] cnts = new int[max];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
			cnts[arr[i]]++;
		}
		if (cnts[1]==1) ans++;
		else if (cnts[1]>1) ans=0;
		else {
			for (int i = 0; i < N; i++) {
				int num = arr[i];
				if (cnts[num]==1) {
					boolean bad=false;
					for (int p = 2; p <= Math.sqrt(num); p++){
						if (num%p==0) {
							if (cnts[p]>=1||cnts[num/p]>=1) {
								bad=true;
								break;
							}
						}
					}
					if (!bad) ans++;
				}
			}
		}
		System.out.println(ans);
	}	
}
