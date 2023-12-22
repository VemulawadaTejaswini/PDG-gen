import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		int a = 0;
		int[] mkind = new int[m+1];
		for(int i = 0;i < n;i ++) {
			int k = sc.nextInt();
			for(int j = 0;j < k;j++) {
				a = sc.nextInt();
				mkind[a]++;
			}
		}
		//System.out.println(Arrays.toString(mkind));
		int sum = 0;
		for(int i = 0;i < m+1;i ++) {
			if(mkind[i] == n) sum ++;
			//System.out.println(mkind[i]);
		}
		System.out.println(sum);
	}
}