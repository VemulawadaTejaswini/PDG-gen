import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int count = Integer.parseInt(br.readLine());
		int[][][] list = new int[4][3][10];
		
		for (int i = 0; i < count; i++) {
			String[] str = br.readLine().split(" ");
			int num01 = Integer.parseInt(str[0]) - 1;
			int num02 = Integer.parseInt(str[1]) - 1;
			int num03 = Integer.parseInt(str[2]) - 1;
			int human = Integer.parseInt(str[3]);
			list[num01][num02][num03] += human;
		}
		
		for (int i = 0; i < list.length; i++) {
			if (!(i == 0)) {
				sb.append("####################");
				sb.append('\n');
			}
			for (int j = 0; j < list[i].length; j++) {
				for (int k = 0; k < list[i][j].length; k++) {
					sb.append(" " + list[i][j][k]);
					if(k == 9){
						sb.append('\n');
					}
					if (k == list[i][j].length - 1) {
						sb.append("");
					}
				}
			}
		}
		System.out.print(sb.toString());
	}
}