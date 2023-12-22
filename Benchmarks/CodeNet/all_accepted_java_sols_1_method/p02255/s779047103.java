import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		StringBuilder buider = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();

		String[] Snums = br.readLine().split(" ");

		int[]  nums = new int[Integer.parseInt(n)];

		for(int i= 0; i<Integer.parseInt(n); i++){
			nums[i]  = Integer.parseInt(Snums[i]);
		}
		int key =0;
		int j=0;
		for(int i=1; i<nums.length; i++){
			key = nums[i];
			j = i-1;
			for(int k=0; k<nums.length; k++){
				buider.append(nums[k]);
				if(k != nums.length-1){
				buider.append(" ");
				}
			}
			System.out.println(buider.toString());
			buider.setLength(0);
			while (j>=0 && nums[j]>key) {
				nums[j+1] =nums[j];
				j--;
			}
			nums[j+1] =key;
		}
		for(int k=0; k<nums.length; k++){
			buider.append(nums[k]);
			if(k != nums.length-1){
			buider.append(" ");
			}
		}
		System.out.println(buider.toString());



	}

}