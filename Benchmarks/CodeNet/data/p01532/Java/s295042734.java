import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int hold10 = sc.nextInt();
			int hold100 = sc.nextInt();
			int max10 = sc.nextInt();
			
			int [][] data = new int[n][2];
			for(int i = 0; i < n; i++){
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt();
			}
			
			int nowMoney = 0;
			int ans = -1;
			for(int i = 0;; i++){
				int ind = i % 3;
				if(data[ind][0] > 0){
					data[ind][0]--;
					nowMoney += 10;
					if(nowMoney >= 90){
						nowMoney = 0;
					}
					hold10++;
					if(hold10 > max10){
						ans = ind % n;
						break;
					}
				}
				else if(data[ind][1] > 0){
					data[ind][1]--;
					nowMoney += 100;
					if(nowMoney >= 90){
						int temp = (nowMoney - 90) / 10;
						data[ind][0] += temp;
						hold10 -= temp;
						if(hold10 < 0){
							ans = ind % n;
							break;
						}
						nowMoney = 0;
					}
				}
				else{
					ans = ind % n;
					break;
				}
			}
			System.out.println(ans + 1);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}