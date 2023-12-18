import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ZTF = sc.nextLong();
		long F025 = ZTF * 4;

		long ZFZ = sc.nextLong();
		long F050 = ZFZ * 2;

		long One = sc.nextLong();
		long F100 = One;

		long Two = sc.nextLong();

		long want = sc.nextLong();

		long ans;

		Long[] nums = {F025,F050,F100};//ここで0.25、0.50、1.00のどれを使うか決める
		int min = 0;
		for(int i = 0;i < 3; i++) {
			if(nums[min] > nums[i]) {
				min = i;
			}
		}

		if(nums[min] * 2 > Two && want >= 2) {
			if(want % 2 == 0) {
				ans = Two * (want / 2);
			} else {
				ans = Two * (want / 2) + nums[min];
			}
		} else  {
			ans = nums[min] * want;
		}

		System.out.println(ans);
	}
}