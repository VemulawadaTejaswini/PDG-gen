import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());
		int[] h = new int[n];
		for(int i = 0;i < n; ++i){
			h[i] = Integer.parseInt(scan.next());
		}
		Arrays.sort(h);
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < n - k +1; ++i){
			min = Math.min(min,h[i + k-1] - h[i]);
		}
		System.out.print(min);
	}
}
