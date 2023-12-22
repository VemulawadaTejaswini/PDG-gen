import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int As[] = new int[A];
		int Bs[] = new int[B];
		for(int i = 0 ; i < As.length ; ++i){
			As[i] = sc.nextInt();
		}
		for(int i = 0 ; i < Bs.length ; ++i){
			Bs[i] = sc.nextInt();
		}
		int ret = As[0] + Bs[0];
		for(int i = 0 ; i < M ; ++i){
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int c = sc.nextInt();
			int v = As[x] + Bs[y] - c;
			ret = Math.min(ret, v);
		}
		Arrays.sort(As);
		Arrays.sort(Bs);
		ret = Math.min(ret, As[0] + Bs[0]);
		System.out.println(ret);
	}
}
