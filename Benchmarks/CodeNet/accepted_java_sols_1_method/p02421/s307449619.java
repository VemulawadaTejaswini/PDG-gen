import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int card = Integer.parseInt(br.readLine());
		int turn = card;
		int win = 3;
		int drow = 1;
		int taropoint = 0;
		int hanakopoint = 0;

		for (int i = 0; i < turn; i++) {
			String str = null;
			str = br.readLine();
			String[] s = str.split(" ");
			String taro = (s[0]);
			String hanako = (s[1]);

			if(taro.compareTo(hanako) == 0){
				taropoint += drow;
				hanakopoint += drow;
			}else if(taro.compareTo(hanako) < 0){
				hanakopoint += win;
			}else{
				taropoint += win;
			}
		}
		System.out.println(taropoint + " " + hanakopoint);
	}
}