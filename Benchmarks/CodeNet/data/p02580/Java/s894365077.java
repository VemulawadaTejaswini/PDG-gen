

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();

		int bombH[] = new int[m];
		int bombW[] = new int[m];
		int bombCol[] = new int[h];
		int bombRow[] = new int[w];
		int colMax = 0;
		int rowMax = 0;

		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < m; i++){
			bombH[i] = sc.nextInt() - 1;
			bombW[i] = sc.nextInt() - 1;

			set.add(bombW[i]+ " " +bombH[i]);

			bombCol[bombH[i]]++;
			bombRow[bombW[i]]++;

			colMax = Math.max(colMax, bombCol[bombH[i]]);
			rowMax = Math.max(rowMax, bombRow[bombW[i]]);
		}

//		System.out.println(colMax+ " "+rowMax);

		int result = 0;

		for(int i = 0; i < h; i++){
			if(bombCol[i] < colMax - 1){
				continue;
			}

			for(int j = 0; j < w; j++){
				int tmpResult = bombCol[i] + bombRow[j];

				if(set.contains(j + " " + i)){
					tmpResult--;
				}

				result = Math.max(result, tmpResult);

				if(result == colMax + rowMax){
					System.out.println(result);
					return;
				}
			}
		}

		System.out.println(result);
	}
}

