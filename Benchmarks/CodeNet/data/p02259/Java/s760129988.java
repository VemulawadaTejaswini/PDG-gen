import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] s_nums = br.readLine().split(" ");

		int[] nums = new int[s_nums.length];

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(s_nums[i]);

		}

		boolean jeudge = true;

		int count =0;

		while(jeudge){
			jeudge = false;
			for(int k = nums.length-1; k>=1; k--){

				if(nums[k]<nums[k-1]){
					int a = nums[k];

					nums[k] =nums[k-1];

					nums[k-1] =a;

					count++;

					jeudge = true;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++){
			sb.append(nums[i]);
			sb.append(" ");
		}

		System.out.println(sb.toString().trim());
		System.out.println(count);
	}


}