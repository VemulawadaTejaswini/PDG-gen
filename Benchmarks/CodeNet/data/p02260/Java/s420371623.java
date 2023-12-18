import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] s = br.readLine().split(" ");

		int[] numbers = new int[n];

		for(int i=0; i<n; i++){
			numbers[i] = Integer.parseInt(s[i]);
		}



		int count = 0;

		count = sellectesort(numbers, n, count);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++){
			sb.append(numbers[i]);
			sb.append(" ");
		}

		System.out.println(sb.toString().trim());
		System.out.println(count);
	}

	static int  sellectesort(int[] nums , int n, int count){

		int min;

		int counts = count;

		Boolean judge = false;

		for(int i=0; i<n-1; i++){
			min =i;

			for(int k=i+1; k<n; k++){
				if(nums[k]<nums[min]){
					min =k;
					judge =true;
				}
			}
			if(judge) counts++;

			int num = nums[i];

			nums[i] = nums[min];

			nums[min] = num;

			judge = false;

		}

		return counts;

	}


}