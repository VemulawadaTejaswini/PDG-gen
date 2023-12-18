import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(in.readLine());
			if(n == 0){
				break;
			}
			ArrayList<Long> nums = new ArrayList<Long>();
			long max = 0;
			long min = -100000;
			nums.add(new Long(0));
			for(int i= 0; i < n;i++){
				int nn = Integer.parseInt(in.readLine());
				if(nn > min){
					min = nn;
				}
				if(nums.get(nums.size()-1)*nn >= 0){
					long j = nums.get(nums.size()-1) + nn;
					nums.set(nums.size()-1, j);
				}
				else {
					nums.add((long)nn);
				}	
			}
			if(nums.size() == 1 && nums.get(0) < 0){
				max = min;
			}
			else{
				if(nums.get(0) < 0){
					nums.remove(0);
				}
				if(nums.get(nums.size()-1) < 0){
					nums.remove(nums.size()-1);
				}
				
				max = nums.get(0);
				for(int h = 0;h < nums.size(); h= h+2){
					long sub = 0;
					for(int i = h ; i < nums.size();i = i+2){
						if(i-h < 2){
							sub = sub + nums.get(i);
						}
						else{
							sub = sub + nums.get(i) + nums.get(i-1);	
						}
						if(max < sub ){
							max = sub;
						}
					}
				}
			}
			System.out.println(max);
		}	
	}
}