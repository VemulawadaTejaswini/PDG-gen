import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Boolean> ans = new ArrayList<Boolean>();
		int j = 0;
		
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int[] nums = new int[3];
			while (st.hasMoreTokens())
				nums[j++] = Integer.parseInt(st.nextToken());
			Arrays.sort(nums);
			ans.add(nums[0] * nums[0] + nums[1] * nums[1] == nums[2] * nums[2]);
			j = 0;
		}
		
		for (boolean a : ans)
			System.out.println(a ? "YES" : "NO");
	}
	
}