import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();/* 太郎の手札の枚数 */
			int m = sc.nextInt();/* 花子の手札の枚数 */
			if(n == 0) break;

			/* それぞれの手札 */
			int[] taro = new int[n], hanako = new int[m];
			/* それぞれの合計 */
			int taro_sum = 0, hanako_sum = 0;
			for(int i = 0; i < n; i++) {
				taro[i] = sc.nextInt();
				taro_sum += taro[i];
			}
			for(int i = 0; i < m ; i++) {
				hanako[i] = sc.nextInt();
				hanako_sum += hanako[i];
			}
			
			int diff = taro_sum - hanako_sum;
			
			boolean _break = false;
			if(diff == 0) {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < m; j++) {
						if(taro[i] == hanako[j]) {
							System.out.println(taro[i] + " " + hanako[j]);
							_break = true;
						}
					}
					if(_break) break;
				}
			}else {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < m; j++) {
						int d = (taro[i] - hanako[j]) * 2;
						if(diff == d || diff == d * -1) {
							System.out.println(taro[i] + " " + hanako[j]);
							_break = true;
						}
					}
					if(_break) break;
				}
			}
			if(!_break) System.out.println("-1");
		}
	}
}

