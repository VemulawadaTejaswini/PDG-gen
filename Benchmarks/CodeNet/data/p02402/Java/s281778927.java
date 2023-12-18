import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int n = scane.nextInt();

		int[] nums = new int[n];

		for(int i =0; i<n; i++){
			nums[i] = scane.nextInt();
		}

	  IntStream stream = Arrays.stream(nums);
	  IntStream stream2 = Arrays.stream(nums);
	  IntStream stream3 = Arrays.stream(nums);

	  OptionalInt min = stream.min();
	  OptionalInt max = stream2.max();
	  int total = stream3.sum();

	  System.out.println(min.getAsInt()+" "+max.getAsInt()+" "+total);

	}
}