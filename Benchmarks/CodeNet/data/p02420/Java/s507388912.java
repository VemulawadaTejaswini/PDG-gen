
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String cards;
			while(true){
				cards = br.readLine();
				if(cards == null || cards.equals("-") ){
					break;
				}
				StringBuilder sb = new StringBuilder(cards);

				int m = Integer.parseInt(br.readLine());

				for(int i=0;i<m;i++){
					int h = Integer.parseInt(br.readLine());

					sb.append(sb.substring(0,h));
					sb.delete(0, h);

				}
				System.out.println(sb.toString());
			}
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