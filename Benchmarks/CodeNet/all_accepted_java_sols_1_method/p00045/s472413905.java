import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];
		int result=0;
		double all=0;
		int i;

		for(i=0; (str=br.readLine()) != null; i++){
			strArray = str.split(",");
			int pr = Integer.parseInt(strArray[0]);
			int m = Integer.parseInt(strArray[1]);
			double m2 = Double.parseDouble(strArray[1]);
			result += pr*m;
			all += m2;
		}
		System.out.println(result);
		System.out.println(Math.round(all/i));
	}
}