

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ????????????????????????????\???????????????¨????????°
		final int VERTICALLIMIT = 12;
		final int SIDELIMIT = 12;

		Scanner in = new Scanner(System.in);
		String[][] land = new String[VERTICALLIMIT][SIDELIMIT];
		int count = 0;
		ArrayList<Integer> islandCount = new ArrayList<>();

		while (in.hasNext()) {

			for (int verticalNum = 0; verticalNum < VERTICALLIMIT; verticalNum++) {

				String worldMap = in.next();

				for (int sideNum = 0; sideNum < SIDELIMIT; sideNum++) {

					// b = a.charAt(j);
					// int c = Integer.parseInt(b + "");
					land[verticalNum] = worldMap.split("");

				}
			}

			for (int verticalNum = 0; verticalNum < VERTICALLIMIT; verticalNum++) {

				for (int sideNum = 0; sideNum < SIDELIMIT; sideNum++) {

					if (land[verticalNum][sideNum].equals("1")) {

						island(land, verticalNum, sideNum);

						count++;

					}
				}
			}

			islandCount.add(count);
			count = 0;

		}

		for(int result: islandCount) {

			System.out.println(result);

		}

	}

	private static void island(String[][] land, int verticalNum, int sideNum) {

		// ????????????????????????????\???????????????¨????????°
		final int VERTICALZERO = 0;
		final int VERTICALLIMIT = 11;
		final int SIDEZERO = 0;
		final int SIDELIMIT = 11;

		if (land[verticalNum][sideNum].equals("1")) {

			land[verticalNum][sideNum] = "0";

			if (verticalNum > VERTICALZERO) {

				island(land, verticalNum - 1, sideNum);

			}

			if (verticalNum < VERTICALLIMIT) {

				island(land, verticalNum + 1, sideNum);

			}

			if (sideNum > SIDEZERO) {

				island(land, verticalNum, sideNum - 1);

			}

			if (sideNum < SIDELIMIT) {

				island(land, verticalNum, sideNum + 1);

			}

		} else {

			return;

		}
	}
}


// ==============================?????°???????????????=======================================

  /*if(land[i + 1][j] == 0 && land[i - 1][j] == 0 && land[i][j + 1] == 0 && land[i][j - 1] == 0) {

	  land[i][j] = 0;

  } else if(land[i + 1][j] == 1 || land[i - 1][j] != 0 || land[i][j + 1] != 0 || land[i][j - 1] != 0){

	  island(land, i + 1, j);

  } else if(land[j + 1][j] == 1 && land[i + 1][j] == 0 || land[i - 1][j] != 0 || land[i][j - 1] != 0) {

	  island(land, i, j + 1);

  } else if(land[i][j - 1] == 1 && land[i + 1][j] == 0 || land[i - 1][j] != 0 || land[i][j - 1] != 0){

	  island(land, i, j - 1);

  } else if(land[i][i - 1] == 1 && land[i + 1][j] == 0 || land[i][j + 1] != 0 || land[i][j - 1] != 0){

	  island(land, i - 1, j);

  }

  	land[i][j] = 0;*/