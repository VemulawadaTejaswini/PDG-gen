
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = null;
			String[] strArr = null;
			StringBuilder sb = new StringBuilder();
			while(true){
				str = br.readLine();
				if(str.equals("0")){
					break;
				}

				strArr = str.split("");
				long sum = 0;
				int len = str.length();
				for(int i=0;i<len;i++){
					sum += Integer.parseInt(strArr[i+1]);
				}

				sb.append(sum).append("\n");
			}

			System.out.print(sb.toString());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ioe) {
			}

		}
	}
}