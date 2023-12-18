import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){


			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			int input[] = new int[n];
			String[] tmpArray = br.readLine().split(" ");

			int sum = 0;
			for(int i = 0; i < n; i++){
				input[i] = Integer.parseInt(tmpArray[i]);
				sum += input[i];
			}

			double ave = (double)sum/n;

			int count = 0;

			for(int i = 0; i < n; i++){
				if(input[i] <= ave){
					count++;
				}
			}

			System.out.println(count);
		}
	}

}

