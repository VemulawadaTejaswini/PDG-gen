import java.util.stream.IntStream;

public class Main {
	public static void main(String[] a) {
		IntStream.rangeClosed(1,9).forEach(i -> {
			IntStream.rangeClosed(1, 9).forEach(j -> {
				System.out.println(i + "x" + j + "=" + i * j);
			});
		});
	}
}