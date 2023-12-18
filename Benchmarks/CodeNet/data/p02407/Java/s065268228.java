import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		String[] nums = sc.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < len; i++){
			sb.append(nums[len - (i + 1)]).append(i < len - 1 ? " " : "");
		}

		System.out.println(sb.toString());
	}
}