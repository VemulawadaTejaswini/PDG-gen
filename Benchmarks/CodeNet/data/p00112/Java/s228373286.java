import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;



public class Main{
	public static void main(String args[]){
		new Main();
	}

	public Main(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> nums = new ArrayList<Integer>();

		try{
			int num;
			while((num = Integer.parseInt(br.readLine())) != 0){
				nums.add(num);
			}

		}catch(IOException err){
			err.printStackTrace();
		}

		int n = nums.get(0);
		nums.remove(0);
		Collections.sort(nums);

		int sum = 0;
		for(int i=0; i<n; i++){
			sum += nums.get(i) * (n-i-1);
		}

		System.out.println(sum);

	}
}