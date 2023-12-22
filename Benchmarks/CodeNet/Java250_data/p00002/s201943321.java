import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<int[]> dataList = new ArrayList<int[]>();
		String str;
		int j=0;
		while ((str = br.readLine()) != null) {
			if(str.length()==0)break;
			String[] strBuf = str.split(" ");
			dataList.add(new int[2]);
			try {
				((int[]) dataList.get(j))[0] = Integer.parseInt(strBuf[0]);
				((int[]) dataList.get(j))[1] = Integer.parseInt(strBuf[1]);
			} catch (NumberFormatException nfex) {
				break;
			}
			j++;
			str = null;
		}

		for (int i = 0; i < dataList.size(); i++) {
			int sum = ((int[]) dataList.get(i))[0]
					+ ((int[]) dataList.get(i))[1];
			System.out.println((int) (Math.log10(sum) + 1));
		}
		br.close();
	}

}