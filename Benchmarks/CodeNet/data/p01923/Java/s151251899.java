import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String input = br.readLine();

			String[] tmpArray = input.split(" ");
			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);

			if(n == 0 && m == 0){
				break;
			}

			Problem problems[] = new Problem[n];

			for(int i = 0; i < n; i++){
				tmpArray = br.readLine().split(" ");

				problems[i] = new Problem(Integer.parseInt(tmpArray[0]), Integer.parseInt(tmpArray[1]));
			}

			Arrays.sort(problems);

			boolean selected[] = new boolean[m + 1];

			int result = 0;

			for(int i = 0; i < n; i++){
				if(!selected[problems[i].difficulty]){
					selected[problems[i].difficulty] = true;
					result += problems[i].recommended;
				}
			}

			System.out.println(result);
		}
	}

}

class Problem implements Comparable<Problem>{
	int difficulty;
	int recommended;

	Problem (int diff, int rec){
		difficulty = diff;
		recommended = rec;
	}

	@Override
	public int compareTo(Problem p1) {
		return p1.recommended - this.recommended;
	}
}
