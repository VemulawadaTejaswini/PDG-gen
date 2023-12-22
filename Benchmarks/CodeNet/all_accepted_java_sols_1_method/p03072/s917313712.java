import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int cnt = 1;
		int flag = 0;
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(nums[j]<=nums[i]) {
					flag = 1;
				}else {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
    }
}
