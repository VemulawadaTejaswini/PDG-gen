import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	static String[] nums ;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		 nums = br.readLine().split(" ");

		int q = Integer.parseInt(br.readLine());

		String[] target_nums = br.readLine().split(" ");

		for(int i=0; i<target_nums.length; i++){
			if(func(0, 0,Integer.parseInt(target_nums[i]))){
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}


	static boolean func(int i, int sum, int target){

/*		System.out.println(i+" "+sum);
*/
			if(sum == target){
				/*System.out.println("??????");*/
				return true;
			}

			if(i >nums.length-1){
				return false;
			}

			if(func(i+1, sum,target)){
				return true;
			}

			if(func(i+1, sum+Integer.parseInt(nums[i]),target)){
				return true;
			};


		return false;

	}

}