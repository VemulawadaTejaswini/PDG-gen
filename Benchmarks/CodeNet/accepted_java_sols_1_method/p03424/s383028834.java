import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		int[] nums =new int[4];
		String[] colors= {"P","W","G","Y"};

		for(int i=0; i<n;i++) {
			String s=sc.next();
			for(int j=0; j<4;j++) {
				if(s.equals(colors[j])) {
					nums[j]+=1;
				}
			}
		}

		for(int nu : nums) {
			if(nu>0) {
				cnt++;
			}
		}
		if(cnt==4) {
			System.out.println("Four");
		}else {
			System.out.println("Three");
		}

	}
}