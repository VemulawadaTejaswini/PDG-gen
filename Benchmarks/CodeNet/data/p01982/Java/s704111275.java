import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int n = Integer.parseInt(tmpArray[0]);
			int l = Integer.parseInt(tmpArray[1]);
			int r = Integer.parseInt(tmpArray[2]);

			if(n == 0){
				break;
			}

			int a[] = new int[n];

			for(int i = 0; i < n; i++){
				a[i] = Integer.parseInt(br.readLine());
			}

			int count = 0;
			for(int i = l; i <= r; i++){
				//閏年チェック
				boolean hit = false;
				for(int j = 0; j < n; j++){
					if(i % a[j] == 0){
						hit = true;
						if(j % 2 == 0){
							count++;
						}

						break;
					}
				}
				if(!hit && n % 2 == 0){
					count++;
				}
			}

			System.out.println(count);
		}
	}

}

