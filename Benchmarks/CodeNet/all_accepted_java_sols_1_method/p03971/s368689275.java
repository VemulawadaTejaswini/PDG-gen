
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		String arr = br.readLine();
		int total = Integer.valueOf(nums[0]);
		int internal = Integer.valueOf(nums[1]);
		int external = Integer.valueOf(nums[2]);
		int internal_count = 0;
		int external_count = 0;
		int total_qual = internal +external;


		for (int index = 0; index < total; index++) {
			if(internal_count+external_count >= total_qual){
				System.out.println("No");
				continue;
			}
			if (arr.charAt(index) == 'a') {
				if(internal_count < internal+external){
					System.out.println("Yes");
					internal_count++;
				}
				else{
					System.out.println("No");
				}
			}
			else if (arr.charAt(index) == 'b') {
				if(external_count < external){
					System.out.println("Yes");
					external_count++;
				}
				else{
					System.out.println("No");
				}

			} else {
				System.out.println("No");

			}
		}

	}

}
