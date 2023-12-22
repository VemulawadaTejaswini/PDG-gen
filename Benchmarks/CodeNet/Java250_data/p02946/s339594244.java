import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		int[] numsInt = new int[2];
		numsInt[0] = Integer.parseInt(nums[0]);
		numsInt[1] = Integer.parseInt(nums[1]);
		if(-1000000 > numsInt[1] - numsInt[0]){
			for(int i =-1000000; i<numsInt[1]+numsInt[0]; i++){
				if(i == -1000000){
					System.out.print(i);
				}else{
					System.out.print(" " + i);
				}
			}
		}
		else if(1000000 < numsInt[1] + numsInt[0]){
			for(int i=numsInt[1]-numsInt[0]+1; i<1000001; i++){
				if(i == numsInt[1]-numsInt[0]+1){
					System.out.print(i);
				} else{
					System.out.print(" " + i);
				}
			}
		}
		else{
			for(int i=numsInt[1]-numsInt[0]+1; i<numsInt[1]+numsInt[0];i++){
				if(i == numsInt[1]-numsInt[0]+1){
					System.out.print(i);
				} else{
					System.out.print(" " + i);
				}
			}
		}
	}
}
