import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] array = new int[4][13]; // s,h,c,d
		String[] mark = new String[] { "S", "H", "C", "D" };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				array[i][j] = 0;
			}
		}

		int kazu = Integer.parseInt(br.readLine());
		for (int i = 0; i < kazu; i++) {
			String input = br.readLine();
			String[] input2 = input.split(" ");
			int number = Integer.parseInt(input2[1]) - 1;

			if (mark[0].equals(input2[0])) {// ????????????
				array[0][number] = 1;

			} else if (mark[1].equals(input2[0])) {// ?????????
				array[1][number] = 1;

			} else if (mark[2].equals(input2[0])) {// ?????????
				array[2][number] = 1;

			} else {// ?????????
				array[3][number] = 1;
			} // if(????????????)
		} // for(input??????)

		// output??????
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (array[i][j] == 0) {
					System.out.println(mark[i] + " " + j + 1);
				}
			}

		}

	}// main

}