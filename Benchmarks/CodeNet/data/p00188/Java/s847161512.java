import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		doIt();
	}
	static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(0 < n){
			int[] nums = new int[n];
			for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
			int target = sc.nextInt();
			int max = n - 1;
			int min = 0;
			int mid = 0;
			int count = 0;
			while(true){
				if(min >= max){count++;break;}
				mid = (max + min) / 2;
				count++;
				if(target == nums[mid]) break;
				else if(target < nums[mid]) max = mid;
				else min = mid + 1;
			}
			System.out.println(count);
			n = sc.nextInt();
		}
	}

}