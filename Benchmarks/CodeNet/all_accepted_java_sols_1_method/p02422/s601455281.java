import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		sb.append(br.readLine());
		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			String[] command = br.readLine().split(" ");
			if (command[0].equals("replace")) {
				sb.replace(Integer.parseInt(command[1]), (Integer.parseInt(command[2]) + 1), command[3]);
			} else if (command[0].equals("reverse")) {
				int index01 = Integer.parseInt(command[1]);
				int index02 = Integer.parseInt(command[2]);
				char moji;
				char[] mojiList = sb.toString().toCharArray();
				while (index01 < index02) {
					moji = mojiList[index01];
					mojiList[index01] = mojiList[index02];
					mojiList[index02] = moji;
					index01++;
					index02--;
				}
				for (int l = 0; l < mojiList.length; l++) {
					sb.append(mojiList[l]);
				}
				sb.delete(0,mojiList.length );
			} else if(command[0].equals("print")){
				System.out.println(sb.substring(Integer.parseInt(command[1]),(Integer.parseInt(command[2]) + 1)));
			}
		}
	}
}