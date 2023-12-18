import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		String[] str = new String[50];
		int i = -1;

		do {

			try {
				i++;
				if(i == 50)
					break;
				str[i] = input.readLine();

			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
		}while(!str[i].equals(""));


		for(int j = 0; j < i; j++) {
			StringBuffer sb = new StringBuffer(str[j]);
			if(str[j].equals(sb.reverse().toString())) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}

}