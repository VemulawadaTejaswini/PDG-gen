import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] nums = new long[n]; 

		for(int i = 0; i < n; i++){
			nums[i] = sc.nextLong();
			if(nums[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		
		long ans = nums[0];
		for(int i = 1; i < n; i++){
			try{
				long ai = nums[i];
				ans = Math.multiplyExact(ans,ai);
				if((long)Math.pow(10, 18) < ans) {
					System.out.println(-1);
					return;
				}
			}catch (Exception e){
				System.out.println(-1);
				return;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}