import java.util.Scanner;
import java.util.stream.IntStream;


public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int N = scanner.nextInt();
			int[] list = new int[N];
			for(int i=0;i<N;i++){
				list[i] = scanner.nextInt();
			}
			int min = IntStream.of(list).min().getAsInt();
			int max = IntStream.of(list).max().getAsInt();
			int sum = IntStream.of(list).sum();
			System.out.println(min+" "+max+" "+sum);
		}
	}
}