import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
		}
		int cnt = 0;
		int maxcnt = 0;
		for(int i = 0; i < n - 1; i++){
			if(h[i] >= h[i+1]){
				cnt++;
			}
			else{
				if(maxcnt < cnt){
					maxcnt = cnt;
				}
				cnt = 0;
			}
		}
		if(maxcnt < cnt){
			maxcnt = cnt;
		}
		System.out.print(maxcnt);
	}

}