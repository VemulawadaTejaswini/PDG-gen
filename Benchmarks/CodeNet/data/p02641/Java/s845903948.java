import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		long[] list = new long[n];
		
		
		for(int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}
		Arrays.sort(list);
		
		long small = 1000;
		long ans = 0;
		long num = 0; 
		boolean judge = false;
		boolean zero = false;
		boolean one = false;
		
		if(n != 0) {
		if(list[n-1] > x) {
			judge = true;
		}else if(list[n-1] < x){
			zero = true;
		}else if(list[0] > x) {
			zero = true;
		}else if(list[0] < x) {
			judge = true;
		}
		/*
		else if(list[n-1] == x) {
			if(list[n-2] == list[n-1] - 1) {
				one = true;
			}
		}*/
		
		
		for(long i = list[0]; i < list[n-1]; i++) {
			boolean skip = false;
			for(int j = 0; j < n; j++) {
				if(i == list[j]) {
					skip = true;
					break;
				}
			}
			if(skip == true) {
				continue;
			}
			
			if(i > 0 && i < x) {
				ans = x - i;
			}
			else if(i > 0 && i > x) {
				ans = i - x;
			}
			else if(i == 0) {
				ans = x;
			}
			else if(i < 0) {
				ans = x + i;
				if(ans < 0) {
					ans = -1 * ans;
				}
			}
			
			if(ans < small) {
				small = ans;
				num = i;
			}
			
		
	}
		if(judge == true) {
		System.out.print(num);
		}
		else if(zero == true) {
			System.out.print(x);
		}
		}
		else {
			System.out.print(x);
		}

}
}