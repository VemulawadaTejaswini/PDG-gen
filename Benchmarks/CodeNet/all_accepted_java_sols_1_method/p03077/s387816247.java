import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long E = sc.nextLong();
		sc.close();
		long min = Long.MAX_VALUE;
		int index = 0;
		long[] trans = new long[] {A,B,C,D,E};
		for(int i = 0;i < 5;i++) {
			min = Math.min(min, trans[i]);
			if(min == trans[i]) {
				index = i+1;
			}
		}
		long btm = N%min==0 ? N/min : N/min + 1;
		System.out.println(btm + 4);
	}
}