import java.awt.AWTError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int diff = in[0] + in[1];
		if (diff >= 24)
			diff %= 24;
		
		System.out.println(diff);		
	}
}
