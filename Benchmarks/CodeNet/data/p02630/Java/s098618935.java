import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			br.readLine();
			int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			br.readLine();
			String s = null;
			while((s=br.readLine()) != null) {
				int[] convs=Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();

				int sum = 0;
				for(int idx=0; idx<nums.length; idx++) {
					if(nums[idx] == convs[0]) {
						nums[idx] = convs[1];
					}
					sum += nums[idx];
				}
				System.out.println(sum);
			}
		} catch(Exception e) {}

	}
}