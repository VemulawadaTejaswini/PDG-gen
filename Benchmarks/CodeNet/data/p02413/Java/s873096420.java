import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");

		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);

		int hanbetsu = Integer.parseInt(s[0]);
		int hanbetsu2 = Integer.parseInt(s[1]);

		if((0 <= hanbetsu)&&(0 <= hanbetsu2)&&(hanbetsu <= 100)&&(hanbetsu2 <= 100)){

			int sub = x + 1;
			int sub2 = y + 1;

			int [][] su2 = new int[sub][sub2];

			for(int i = 0; i < x; i++){
				String str2 =br.readLine();
				String [] s2 = str2.split(" ");

				for(int j = 0; j < y; j++){
					su2[i][j]= Integer.parseInt(s2[j]);
					su2[x][y] += Integer.parseInt(s2[j]);

					su2[x][j] += Integer.parseInt(s2[j]);
					su2[i][y] += Integer.parseInt(s2[j]);
				}
			}
			for(int k = 0; k < x + 1; k++){
				for(int j = 0; j < y + 1; j++){
					System.out.print(su2[k][j] + " ");
				}
				System.out.println();
			}
		}
	}
}