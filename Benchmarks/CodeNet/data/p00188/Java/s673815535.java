import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si();
			if(n==0) break;
			int[] ary = new int[n];
			for (int i = 0; i < n; i++) {
				ary[i] = si();
			}

			out.println(binarySearchCount(ary,si()));
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}

	static int binarySearchCount(int[] ary,int n){
		int left = 0,right = ary.length,cnt = 0;
		while(true){
			int mid = (left+right-1)/2;
			if(left>=right) break;
			cnt++;
			if(mid==n) break;
			else{
				if(ary[mid]<n) left = mid+1;
				else right = mid;
			}
		}
		return cnt;
	}
}