

import java.util.Arrays;
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
		RowInfo rowInfo[] = new RowInfo[w];

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

		for(int i = 0; i < w; i++){
			rowInfo[i] = new RowInfo(bombRow[i], i);
		}

		Arrays.sort(rowInfo);

//		System.out.println(colMax+ " "+rowMax);

		int result = 0;

		for(int i = 0; i < h; i++){
			if(bombCol[i] < colMax){
				continue;
			}

			for(int j = 0; j < w; j++){
				if(rowInfo[j].count < rowMax){
					break;
				}

				int tmpResult = bombCol[i] + rowInfo[j].count;

				if(set.contains(rowInfo[j].oldIndex + " " + i)){
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

class RowInfo implements Comparable<RowInfo>{
	int count = 0;
	int oldIndex;

	RowInfo(int count, int oldIndex){
		this.count = count;
		this.oldIndex = oldIndex;
	}

	@Override
	public int compareTo(RowInfo r) {
		// TODO 自動生成されたメソッド・スタブ
		return r.count - this.count;
	}


}
