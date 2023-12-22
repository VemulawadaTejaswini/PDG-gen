import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 初期化
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String[] list = sc.next().split("");
		
		List<Integer> one_zero_list = new ArrayList<Integer>();
		
		// 現在見ている数
		int now=1;
		// 上記数が何個続いたかカウント
		int cnt=0;
		
		for(int i=0;i<list.length;i++) {
			//
			if(list[i].charAt(0) == (char)('0'+now)) {
				cnt++;
			}
			else {
				one_zero_list.add(cnt);
				cnt=1;
				// 現在見ている数を反転する。
				now = 1 - now;
			}
		}
		
		// 最後のカウントを足す
		if(cnt != 0) {
			one_zero_list.add(cnt);
		}
		
         // 1-0-1-0-1-0-1のように最後は1のカウントで終わらしたいので、
         // 1-0-1-0-1-0 で終わっていたら1を足す
        if (one_zero_list.size() % 2 == 0) {
        	one_zero_list.add(0);
        }
        
        // 累積和を取得する。
        // ruiseki_waのindex  0 1 2 3 4 5 6  7  8  9
        // ruiseki_waのvalue  0 3 4 5 6 7 8 10 12 14
        int[] ruiseki_wa = new int[one_zero_list.size() + 1];
        
		for(int i=0;i<one_zero_list.size();i++) {
			ruiseki_wa[i+1] = ruiseki_wa[i] + one_zero_list.get(i);
			
		}
		
		// 反転回数の次までをrightとする。
		int countRange = 2 * K + 1;
		int result=0;
		
		for(int i=0;i<ruiseki_wa.length;i+=2) {
			// left、rightの計算
			int left=i;
			int right = Math.min(i + countRange, one_zero_list.size());
			int temp = ruiseki_wa[right] - ruiseki_wa[left];
			result = Math.max(result, temp);
			
		}
		System.out.println(result);
	}
}
