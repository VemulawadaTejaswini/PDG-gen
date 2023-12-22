
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = br.readLine();
			String[] strArr = str.split(" ");
			int m = Integer.parseInt(strArr[0]);
			int f = Integer.parseInt(strArr[1]);
			int r = Integer.parseInt(strArr[2]);

			List<String> scores = new ArrayList<String>();
			int sum = 0;
			boolean yasumi=false;
			while (!( m==-1 && f==-1 && r==-1)) {

				sum = m+f;
				yasumi = m==-1 || f==-1;

				if(!yasumi && 80<=sum){
					scores.add("A");
				}else if(!yasumi && 65<=sum){
					scores.add("B");
				}else if(!yasumi && (50<=sum || (sum<50 && 50<=r))){
					scores.add("C");
				}else if(!yasumi && 30<=sum){
					scores.add("D");
				}else{
					scores.add("F");
				}

				str = br.readLine();
				strArr = str.split(" ");
				m = Integer.parseInt(strArr[0]);
				f = Integer.parseInt(strArr[1]);
				r = Integer.parseInt(strArr[2]);

				;
			}

			for(String s : scores){
				System.out.println(s);
			}

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