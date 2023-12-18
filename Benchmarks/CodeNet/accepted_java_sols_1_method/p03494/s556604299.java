import java.util.*;
public class Main {
	public static void main(String[]args) {

		
		Scanner sc = new Scanner(System.in);
		 
		int cnt = sc.nextInt();
		
		int[] nums = new int[cnt];
		
		for (int i = 0 ; i < cnt; i++) {
			
			int num = sc.nextInt();
			
			nums[i] = num;  
			
		}
		// even judge method
		boolean repeatFlg = true;
		int result = 0;
		while (repeatFlg) {
			for (int i = 0 ; i < cnt; i++) {
				
				int num = nums[i];
				
				if (num % 2 == 0) {
					
					nums [i] = num / 2;
				} else {
					repeatFlg = false;
					nums [i] = -1;
					break;
				}
			}
			if (repeatFlg)
				result++;
		}
					
		System.out.println(result);
	}
	
//	public static int judgeAllEven(int result,int[]nums){
//		for (int num :nums) {
//			
//			if (num == -1) {
//				result--;
//				
//				break;
//			}
//		}
//
//		return result;
//	}

}
				
				
				
			