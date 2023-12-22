
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
			int n = Integer.parseInt(strArr[0]);
			int x = Integer.parseInt(strArr[1]);

			List<Integer> counters = new ArrayList<Integer>();
			Integer count;
			while (!( n==0 && x==0)) {

				count = 0;
				for(int i=1;i<=n;i++){
					for(int j=i+1;j<=n;j++){
						for(int k=j+1;k<=n;k++){
							if(i+j+k == x){
								count++;
							}
						}
					}
				}
				counters.add(count);

				str = br.readLine();
				strArr = str.split(" ");
				n = Integer.parseInt(strArr[0]);
				x = Integer.parseInt(strArr[1]);

			}

			for(Integer s : counters){
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