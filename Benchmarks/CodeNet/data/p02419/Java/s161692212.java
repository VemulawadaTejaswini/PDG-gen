
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		final String END_OF_TEXT = "END_OF_TEXT";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String schStr = br.readLine();
			// ?°??????????????????????
			schStr = schStr.toLowerCase();

			String str;
			String s;
			int cnt = 0;
			while(!(str = br.readLine()).equals(END_OF_TEXT)){

				// ????´¢????±?????°??????????????????????
				s = str.toLowerCase();

				int point = -1;
				while((point = s.indexOf(schStr, point+1)) != -1){
					cnt++;
				}
			}
			System.out.println(cnt);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}