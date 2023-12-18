
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String sline = sc.next();
		int n = sline.length();
		int[] sl = new int[n];
		for (int i=0; i<n; i++){
			sl[i] = Integer.parseInt(String.valueOf(sline.charAt(i)));
		}
		int ans0 = 0;
		int ans1 = 0;
		// 010
		for(int i=0; i<n; i++){
			if(i%2==0 && sl[i]==0){
				continue;
			} else if (i%2==1 && sl[i]==1) {
				continue;
			} else {
				ans0++;
			}
		}
		// 10
		for(int i=0; i<n; i++){
			if(i%2==0 && sl[i]==1){
				continue;
			} else if (i%2==1 && sl[i]==0) {
				continue;
			} else {
				ans1++;
			}
		}
		System.out.println(Math.min(ans0, ans1));
		
	}

}
