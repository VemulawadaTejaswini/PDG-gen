import java.util.Scanner;
import java.util.stream.LongStream;


public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int N = scanner.nextInt();
			long[] list = new long[N];
			for(int i=0;i<N;i++){
				list[i] = scanner.nextInt();
			}
			long min = LongStream.of(list).min().getAsLong();
			long max = LongStream.of(list).max().getAsLong();
			long sum = LongStream.of(list).sum();
			System.out.println(min+" "+max+" "+sum);
		}
	}
}