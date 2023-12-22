import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.LongStream;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int n = scane.nextInt();

		long[] nums = new long[n];

		for(int i =0; i<n; i++){
			nums[i] = scane.nextInt();
		}

	  LongStream stream = Arrays.stream(nums);
	  LongStream stream2 = Arrays.stream(nums);
	  LongStream stream3 = Arrays.stream(nums);

	  OptionalLong min = stream.min();
	  OptionalLong max = stream2.max();
	  long total = stream3.sum();

	  System.out.println(min.getAsLong()+" "+max.getAsLong()+" "+total);

	}
}