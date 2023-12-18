import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int dataNum = Integer.parseInt(br.readLine());
			if(dataNum == 0) break;
			
			int[] nums = new int[dataNum];
			
			for(int i = 0 ; i < dataNum ; i++){
				nums[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(nums);
			
			int totalWaitTime = 0;
			int sum = 0;
			for(int i = 0 ; i < dataNum ; i++){
				totalWaitTime += sum;
				sum += nums[i];
			}
			System.out.println(totalWaitTime);
		}
		
	}

}