import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        insertionSort(count, nums);
    }

    private static void insertionSort(int count, int[] nums) {
    	int j, v;
    	for (int i = 1; i < count; i++) {
    		v = nums[i];
    		j = i - 1;
    		while (j >= 0 && nums[j] > v) {
    			nums[j + 1] = nums[j];
    			j--;
    		}
    		nums[j + 1] = v;
    		System.out.println(Arrays.toString(nums).replaceAll("[\\[\\]]", ""));
    	}
    }

}
