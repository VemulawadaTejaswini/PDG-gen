import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] strAry;
		int[][] table;
		int n;
		StringBuffer sb = new StringBuffer();
		while(!(str = br.readLine()).equals("0")){
			n = Integer.parseInt(str);
			table = new int[n+1][n+1];
			strAry = new String[n];
			for(int i = 0 ; i < n ; i++){
				strAry = br.readLine().split(" ");
				int num;
				for(int y = 0 ; y < n ; y++ ){
					num = Integer.parseInt(strAry[y]);
					table[i][y] = num;
					table[i][n] += num;
					table[n][y] += num;
					table[n][n] += num;
				}
			}

			for(int i = 0 ; i < n + 1 ; i++){
				for(int y = 0 ; y < n + 1 ; y++){
					sb.append(String.format("%5s",String.valueOf(table[i][y])));
				}
				sb.append("\n");
			}
		}
		sb.delete(sb.length() - 1, sb.length());
		System.out.println(sb.toString());
	}
}