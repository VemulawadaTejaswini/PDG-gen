import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
		}
		Arrays.sort(a); //昇順
        int count = 0;
        int ans = 0;
        for (int c = 0; c < n; c++) {
            for(int b = 0; b < n; b ++) {
                if(a[c] < a[b]){
					count= n - 1; //割られる数の方が大きい時点で割り切れない
					break;
				}
				else if(!(c == b) && !(a[c] % a[b] == 0)){
					count++;
				}
				else if(!(c == b) && a[c] % a[b] == 0){
					break; //割られた時点でループ抜け出す
				}
			}
			if(count == n - 1) {
				ans++;
			}
			count = 0;
		}
		System.out.println(ans);
    }
}