import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ary[][] = new int[N][4];
		for(int i = 0; i < N; i++){
			ary[i][0] = sc.nextInt();
			ary[i][1] = sc.nextInt();
			ary[i][2] = ary[i][0] + ary[i][1];
			ary[i][3] = i;
		}
		Arrays.sort(ary, Comparator.comparingInt(o -> o[2]));
		long a = 0;
		long b = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				a += ary[N - 1 - i][0];
			} else {
				b += ary[N - 1 - i][1];
			}	
		}
		System.out.println(a - b);
	}
}
