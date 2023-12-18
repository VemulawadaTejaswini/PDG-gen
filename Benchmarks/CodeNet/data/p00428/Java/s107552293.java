import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static final String IS_GO = "1";
	public static final String IS_NO_GO = "0";

	public static final int ARR_MEMBER = 0;
	public static final int ARR_POSITION = 1;


	public static void main(String[] args) throws IOException {

		BufferedReader buffReader = new BufferedReader(new FileReader("input.txt"));
		ArrayList<Integer[]> alArrPopularityPosition = new ArrayList<Integer[]>();

		while(true) {
			String[] arrMemberPosition = buffReader.readLine().split(" ");
			int member = Integer.parseInt(arrMemberPosition[ARR_MEMBER]);
			int position = Integer.parseInt(arrMemberPosition[ARR_POSITION]);

			if(member == position && member == 0) break;
			Integer[] arrPopularityPosition = new Integer[position];

			for(int i = 0; i < position; i++) arrPopularityPosition[i] = 0;

			for(int i = 0; i < member; i++) {
				String[] arrPosition = buffReader.readLine().split(" ");

				for(int j = 0; j < position; j++) arrPopularityPosition[j] += arrPosition[j].equals(IS_GO) ? 1 : 0;
			}

			for(int i = 0; i < position; i++) {
				for(int j = 0; j < position; j++) {
					if(arrPopularityPosition[i] < arrPopularityPosition[j]) {
						int tmp = arrPopularityPosition[i];
						arrPopularityPosition[i] = arrPopularityPosition[j];
						arrPopularityPosition[j] = tmp;
					}
				}
			}
			alArrPopularityPosition.add(arrPopularityPosition);
		}

		FileWriter fileWriter = new FileWriter("output.txt");

		for(Integer[] arrPopularityPosition: alArrPopularityPosition) {
			for(Integer position: arrPopularityPosition) {
				fileWriter.write(position + " ");
			}
			fileWriter.write(" ");
		}

		fileWriter.close();
	}

	public static String getStringCharAt(String str, int position) {
		return String.valueOf(str.charAt(position));
	}

	public static String[] getStringCharArr(String str) {

		String[] arrResult = new String[str.length()];

		for(int i = 0; i < str.length(); i++) arrResult[i] = getStringCharAt(str, i);

		return arrResult;
	}
}