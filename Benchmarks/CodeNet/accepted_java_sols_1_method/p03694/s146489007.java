import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
                int n = sc.nextInt();
		int[] a = new int[n];
                for (int i=0; i<n; i++) {
                      a[i] = sc.nextInt();
                }
                Arrays.sort(a);
                System.out.println(a[n-1]-a[0]);
	}
}