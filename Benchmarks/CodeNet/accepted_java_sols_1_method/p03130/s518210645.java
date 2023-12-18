import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		Long[] nums = new Long[6];
		for(int i=0; i<6; i++) {
			nums[i] = sc.nextLong();
		}
		
		for(int i=0; i<6; i++) {
			long tmp = nums[i];
			int count = 0;
			for(int j=0; j<6; j++) {
				if(tmp == nums[j]) {
					count++;
				}
			}
			if(count>=3) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
    }

}
