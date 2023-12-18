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
		
		int aw = in[0] + in[1];
		int min = 0;
		if (aw < in[2]) 
			min = in[2] - aw;
		else if (in[0] >= in[1])
			min = 0;
		else if (aw > in[2])
			min = in[1] - (in[0] + in[2]);
		
		System.out.println(min);		
	}
}
