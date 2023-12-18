import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(arr);
		int pointer = 0;
		int ans = 0;
		int nowVal = arr[0];
		int nowCnt=1;
		while(pointer < arr.length) {
			nowVal = arr[pointer];
			nowCnt = 1;
			while(pointer + 1 < arr.length && arr[pointer+1] == nowVal) {
				nowCnt++;
				pointer++;
			}
			
			if(nowVal < nowCnt) {
				ans += nowCnt - nowVal;
			}else if(nowVal > nowCnt) {
				ans += nowCnt;
			}
			pointer++;
		}
		
		System.out.println(ans);
	}
}
