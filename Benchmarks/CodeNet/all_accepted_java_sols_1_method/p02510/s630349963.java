import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String strNum;
		int num,how;

		while(!(str=br.readLine()).equals("-")){
			how=Integer.parseInt(strNum=br.readLine());//シャッフル回数

			for(int i=0; i<how; i++){
				num = Integer.parseInt(strNum=br.readLine());
				String left = str.substring(0, num);
				String right = str.substring(num, str.length());
				str = right + left;
			}
			System.out.println(str);
		}

	}
}