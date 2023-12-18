import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		//??????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		//??????????????????????????±???StringBuilder?????????????????????
		StringBuilder sb = new StringBuilder();
		
		sb.append(line);
		line = br.readLine();
		int meireiSousu = Integer.parseInt(line);
		String nukitoriStr = "";	//
		
		for (int i = 0; i < meireiSousu; i++) {
			String line2 = br.readLine();
			String[] meirei = line2.split("[\\s]+");
			String meireiStr = meirei[0];
			int meirei_kazu1 = Integer.parseInt(meirei[1]);
			int meirei_kazu2 = Integer.parseInt(meirei[2]) + 1;

			if (meireiStr.equals("replace")) {
				sb.replace(meirei_kazu1, meirei_kazu2, meirei[3]);
			} else if (meireiStr.equals("reverse")) {
				nukitoriStr = sb.substring(meirei_kazu1, meirei_kazu2);
				StringBuilder sb1 = new StringBuilder(nukitoriStr);
				sb1.reverse();
				nukitoriStr = sb1.toString();
				sb.replace(meirei_kazu1, meirei_kazu2, nukitoriStr);
			} else {
				String hyoujiStr = sb.substring(meirei_kazu1, meirei_kazu2);
				System.out.println(hyoujiStr);
			}
		}
	}
}