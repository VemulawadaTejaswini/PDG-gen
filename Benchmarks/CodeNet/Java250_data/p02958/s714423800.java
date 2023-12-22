import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] nums = new int[N];
		int[] nums2= new int[N];
		int cnt=0;

		for(int i=0;i<N;i++) {
			nums[i]=sc.nextInt();
			nums2[i]=nums[i];
		}
		Arrays.sort(nums2);

		for(int i=0;i<N;i++) {
			if(nums[i]!=nums2[i]) {
				cnt++;
			}
		}
		System.out.println(cnt<=2?"YES":"NO");
		sc.close();
	}
}