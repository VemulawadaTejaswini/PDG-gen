import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		int[] nums=new int[Integer.parseInt(line)];
		for(int n=0;n<nums.length;n++){
			nums[nums.length-1-n]=Integer.parseInt(br.readLine());
		}
		for(int n=0;n<nums.length;n++){
			System.out.println(nums[n]);
		}

	}
}