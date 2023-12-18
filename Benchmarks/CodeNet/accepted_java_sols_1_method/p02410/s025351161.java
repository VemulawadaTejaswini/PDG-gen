
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = br.readLine();
			String[] strArr = str.split(" ");

			// ??\?????¶??°???????????¨????????\???
			int n = Integer.parseInt(strArr[0]);
			int m = Integer.parseInt(strArr[1]);

			// ?¨??????¨??????
			String[][] a = new String[n][m];
			String[] b = new String[m];

			// n ?? m ?????? ?????\???
			for(int i=0;i<n;i++){
				str = br.readLine();
				a[i] = str.split(" ");

			}
			// n ?? 1 ?????? ?????\???
			for(int i=0;i<m;i++){
				b[i] = br.readLine();
			}

			// ?¨???? ??????
			int sum;
			for(int i=0;i<n;i++){
				sum=0;
				for(int j=0;j<m;j++){
					sum+=Integer.parseInt(a[i][j]) * Integer.parseInt(b[j]);
				}
				System.out.println(sum);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(br != null){
					br.close();
				}
			}catch(IOException ioe){
			}

		}
	}
}