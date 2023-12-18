import java.util.*;

public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);

		List<Integer> resultList = new ArrayList<Integer>();
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if (n == 0 && m == 0) {
				break;
			}
			
			int[][] array = new int[n][m];
			int[][] resultArray = new int[m][2];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					resultArray[j][0] = j + 1;
					array[i][j] = sc.nextInt();
					resultArray[j][1] += array[i][j];
				}
			}
			resultArray = sortArray(resultArray, 0);
			
			for (int k = 0; k < resultArray.length; k++) {
				resultList.add(resultArray[k][0]);
			}
			resultList.add(0);
		}
		
		for (int l = 0; l < resultList.size(); l++) {
			if (resultList.get(l) == 0) {
				System.out.println("");
			} else if (resultList.get(l + 1) == 0) {
				System.out.print(resultList.get(l));
			} else {
				System.out.print(resultList.get(l) + " ");
			}
		}
	}

	private static int[][] sortArray(int[][] array, int index) {
		if (index == array.length) {
			return array;
		}
		
		int max = 0;
		int maxIndex = 0;
		for (int i = index; i < array.length; i++) {
			if (max < array[i][1]) {
				max = array[i][1];
				maxIndex = i;
			}
		}

		int tmpKey   = array[index][0];
		int tmpValue = array[index][1];
		array[index][0] = array[maxIndex][0];
		array[index][1] = array[maxIndex][1];
		array[maxIndex][0] = tmpKey;
		array[maxIndex][1] = tmpValue;
		return sortArray(array, index + 1);
	}
}