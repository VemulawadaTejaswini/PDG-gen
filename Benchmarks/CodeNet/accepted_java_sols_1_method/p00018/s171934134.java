import static java.util.Arrays.sort;
import java.io.*;
import java.util.Collections;
public class Main {
	public static void main(String[] args) throws IOException {
		String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
		String[] sarr = s.split(" ",0);
		Long[] nums = new Long[sarr.length];
		for(int i=0;i<sarr.length;i++)
			nums[i] = Long.parseLong(sarr[i]);
		sort(nums,Collections.reverseOrder());
		for(int i=0;i<nums.length-1;i++)
			System.out.printf("%d ",nums[i]);
		System.out.println(nums[nums.length-1]);
	}
}