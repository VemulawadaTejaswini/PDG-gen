import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] menu = new int[5];

		//入力
		for(int i=0; i<menu.length; i++) {
			menu[i] = sc.nextInt();
		}

		//最後に注文するもの
		int last = 0;
		for(int i=0; i<menu.length; i++) {
			int x = menu[i]%10;
			int y = menu[last]%10;
			if((y==0) || (x!=0 && x<y)) {
				last = i;
			}
		}

		int ans = 0;
		//時刻の計算
		for(int i=0; i<menu.length; i++) {
			if(i!=last) {
				int time = menu[i];
				if(time%10 != 0) {
					time = time - time%10 + 10;
				}
				//System.out.println(time);
				ans += time;
			}
		}
		ans += menu[last];

		System.out.println(ans);

		sc.close();
	}
}