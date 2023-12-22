import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] nums = new int[a];
		
		for(int i = a-1; i >= 0; i--){
			nums[i] = sc.nextInt();
		}
		
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < nums.length; i++){
			if(i != nums.length-1) str.append(nums[i] + " ");
			else str.append(nums[i]);
		}
		
		System.out.println(str);
		
	}

}