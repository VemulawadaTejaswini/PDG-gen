import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dataNum = Integer.parseInt(br.readLine());
		int[] nums = new int[dataNum];
		
		for(int i = 0 ; i < dataNum ; i++){
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(nums);
		
		int totalWaitTime = 0;
		int beforWaitTime = 0;
		for(int i = 0 ; i < dataNum - 1 ; i++){
			totalWaitTime += beforWaitTime + nums[i];
			beforWaitTime += nums[i];
		}
		
		System.out.println(totalWaitTime);
		
	}

}