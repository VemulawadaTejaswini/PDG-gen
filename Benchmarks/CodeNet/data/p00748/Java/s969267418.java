import java.util.*;
public class Main{
	static int[] list1 = new int[180];
	static int[] list2 = new int[45];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		makeList();
		int[] dp1 = new int[1000000];
		int[] dp2 = new int[1000000]; 
		

		Arrays.fill(dp1, 2 << 27);
		Arrays.fill(dp2, 2 << 27);

		dp1[0] = dp2[0] =  0;

		for(int i = 0; i < 180; i++) {
			for(int j = 0; j < 1000000; j++) {
				if(j + list1[i]  >= 1000000) break;
				dp1[j + list1[i]] = Math.min(dp1[j+list1[i]], dp1[j] + 1);
				if(list1[i] % 2 == 1) dp2[j + list1[i]] = Math.min(dp2[j+list1[i]], dp2[j]+1);
			}
		}
		
		while(true) {
			int a = sc.nextInt();
			if(a == 0) break;
			System.out.println(dp1[a] + " " + dp2[a]);
		}
	}
	
	static void makeList() {
		int count1 = 0;
		for(int i = 1; i < 181; i++) {
			int sum = i*(i+1)*(i+2)/6;
			list1[count1++] = sum;
		}
	}
	

	
}