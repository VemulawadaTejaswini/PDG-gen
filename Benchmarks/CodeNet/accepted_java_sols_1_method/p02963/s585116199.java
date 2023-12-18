import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long point[][] = new long[3][2];
		point[0][0] = 0;
		point[0][1] = 0;
		long rt = (long)Math.ceil(Math.sqrt(s));
		if(rt * rt == s) {
			System.out.println("0 0 0 "+rt+" "+rt+" 0"); return;
		}
		point[1][1] = rt;
		point[2][0] = rt;
		long rest = rt * rt - s;
		long max = (long)Math.pow(10, 9);
		for(long i = 1; i * i <= rest; i ++) {
			if(rest % i == 0 && rest / i <= max) {
				point[1][0] = i;
				point[2][1] = rest / i;
			}
		}
		
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 2; j ++) {
				System.out.print(point[i][j]+" ");
			}
		}
		System.out.println();
	}
}