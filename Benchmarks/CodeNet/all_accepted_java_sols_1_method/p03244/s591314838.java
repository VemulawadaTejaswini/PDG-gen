import java.io.*;
import java.math.*;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] even = new int[100001][2]; //[Number of occurances, which number is analyzed]
		//Needed due to sorting mixing indices up
		int[][] odd = new int[100001][2];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			if (i%2==0) {
				even[x][0]++;
				even[x][1]=x;
			} 
			else {
				odd[x][0]++;
				odd[x][1]=x;
			} 
		}
		Arrays.sort(even,(a,b)->Integer.compare(a[0], b[0]));
		Arrays.sort(odd,(a,b)->Integer.compare(a[0], b[0]));
		if (even[100000][1]!=odd[100000][1]) {
			ans+=N/2-even[100000][0];
			ans+=N/2-odd[100000][0];
		}else {
			int sub = Math.max(even[100000][0]+odd[99999][0], odd[100000][0]+even[99999][0]);
			ans+=N-sub;
		}
		System.out.println(ans);
	}
}