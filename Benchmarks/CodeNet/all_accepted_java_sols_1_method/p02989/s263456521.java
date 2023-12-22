import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] d = new int[n];

		// 整数の入力
		for(int i=0;i<n;i++)
			d[i] = sc.nextInt();

		Arrays.sort(d);

		// 出力
		System.out.println(d[n/2]-d[n/2-1]);
	}
}