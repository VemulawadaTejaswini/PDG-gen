import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		int[] nums = {a,b,c,d,e};
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(Math.abs(nums[i]-nums[j])>k) {
					System.out.println(":(");
					return;
				}else {
					continue;
				}
			}
		}
		System.out.println("Yay!");
		
    }
}
