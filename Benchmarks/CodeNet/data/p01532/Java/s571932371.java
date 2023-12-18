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
				int ind = i % n;
				if(data[ind][0] > 0){
					data[ind][0]--;
					nowMoney += 10;
					hold10++;
					if(hold10 > max10){
						ans = ind;
						break;
					}
				}
				else if(data[ind][1] > 0){
					data[ind][1]--;
					nowMoney += 100;
					hold100++;
				}
				else{
					ans = ind;
					break;
				}
				
				if(nowMoney >= 90){
					nowMoney -= 90;
					int num100 = -1;
					for(int j = 0; j <= hold100; j++){
						if(nowMoney < j * 100) break;
						if((nowMoney - 100 * j) / 10 <= hold10){
							num100 = j;
							break;
						}
					}
					if(num100 == -1){
						ans = ind;
						break;
					}
					data[ind][0] += (nowMoney - 100 * num100) / 10;
					data[ind][1] += num100;
					hold100 -= num100;
					hold10 -= (nowMoney - 100 * num100) / 10;
					
					nowMoney = 0;
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