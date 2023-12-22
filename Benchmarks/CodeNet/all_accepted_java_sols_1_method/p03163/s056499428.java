import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxW = sc.nextInt();

		long[] value = new long[maxW+1];


		for (int i=0;i<n;i++) {
			int w = sc.nextInt();
			long v = sc.nextLong();
			for (int j=maxW-w;j>=0;j--) {
				value[j+w]=Math.max(value[j+w],value[j]+v);
			}
		}

		System.out.println(LongStream.of(value).max().getAsLong());
	}

}