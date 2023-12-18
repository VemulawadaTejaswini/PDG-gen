import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dep = 12;
		int wid = 12;
		int num;
		int output = 0;
		int[][] island;

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			island = new int[wid][dep];
			String line = null;
			while (sc.hasNext()) {

				//?????¢??????????????????
				for (int i = 0; i < dep; i++) {
					line = sc.nextLine();
					String[] lineList = line.split("");
					for (int j = 0; j < lineList.length; j++) {

						island[i][j] = Integer.parseInt(lineList[j]);
					}
				}
				//??¶????\????????????????????????????
				for (int i = 0; i < island.length; i++) {
					for (int j = 0; j < island[0].length; j++) {

						output += islandCount(island,i,j);
					}

				}
				System.out.println(output);
				//???????????¨???????????????????????????
				output = 0;
				line = sc.nextLine();
			}

		} finally {
			sc.close();
		}
	}
	//??¶????¢??????????????????????
	public static int islandCount(int[][] map, int dep, int wid){

		int count = 0;
		int[][] checkmap = map;

		//??¶?????¢???
		if (checkmap[dep][wid] == 1) {
			checkmap[dep][wid] = -1;

			//??????????????§??????
			if (wid != checkmap[0].length - 1) {
				if (checkmap[dep][wid + 1] == 1) {
					islandCount(checkmap, dep, wid + 1);
				}
			}
			if (wid != 0) {
				if (checkmap[dep][wid - 1] == 1) {
					islandCount(checkmap, dep, wid - 1);
				}
			}

			if (dep != checkmap.length - 1) {
				if (checkmap[dep + 1][wid] == 1) {
					islandCount(checkmap, dep + 1, wid);
				}
			}

			if (dep !=0) {
				if (checkmap[dep - 1][wid] == 1) {
					islandCount(checkmap, dep - 1, wid);
				}
			}

			count++;
		}
		return count;
	}
}