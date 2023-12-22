
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		int task1,task2,task3;
		int cost[] = new int[6];
		int ans=1000;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		task1 = Integer.parseInt(str[0]);
		task2 = Integer.parseInt(str[1]);
		task3 = Integer.parseInt(str[2]);

		//1-2-3
		cost[0] = Math.abs(task1-task2)+Math.abs(task2-task3);
		//1-3-2
		cost[1] = Math.abs(task1-task3)+Math.abs(task3-task2);
		//2-1-3
		cost[2] = Math.abs(task2-task1)+Math.abs(task1-task3);
		//2-3-1
		cost[3] = Math.abs(task2-task3)+Math.abs(task3-task1);
		//3-1-2
		cost[4] = Math.abs(task3-task1)+Math.abs(task1-task2);
		//3-2-1
		cost[5] = Math.abs(task3-task2)+Math.abs(task2-task1);

		for(int i=0;i<6;i++) {
			if(ans > cost[i]) {
				ans = cost[i];
			}
		}

		System.out.println(ans);

	}

}
