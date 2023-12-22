

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x[] = new int[3];
		x[0] = in.nextInt();
		x[1] = in.nextInt();
		x[2] = in.nextInt();
		Arrays.sort(x);
		int sum=x[0]+x[1]+x[2];
		if(sum%2==(x[2]*3)%2) {
			int n=(x[2]*3-sum)/2;
			System.out.print(n);
		}else {
			int n=((x[2]+1)*3-sum)/2;
			System.out.print(n);
		}
	}
}
