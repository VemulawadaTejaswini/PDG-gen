import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String[] lineString = sc.nextLine().split(" ");
		int numberOfObservatory = Integer.parseInt(lineString[0]);
		int numberOfLoad = Integer.parseInt(lineString[1]);

		int[] elevationList = new int[numberOfObservatory];
		int[] elevationMaxList = new int[numberOfObservatory];
		for (int observatory = 0; observatory < numberOfObservatory; observatory++) {
			int elevation = sc.nextInt();
			elevationList[observatory] = elevation;
			elevationMaxList[observatory] = 0;
		}

		for (int load = 0; load < numberOfLoad; load++) {
			int observatoryA = sc.nextInt() - 1;
			int observatoryB = sc.nextInt() - 1;
			elevationMaxList[observatoryA] = Math.max(elevationMaxList[observatoryA], elevationList[observatoryB]);
			elevationMaxList[observatoryB] = Math.max(elevationMaxList[observatoryB], elevationList[observatoryA]);
		}

		int goodObservatory = 0;
		for (int observatory = 0; observatory < numberOfObservatory; observatory++) {
			if (elevationMaxList[observatory] < elevationList[observatory]) {
				goodObservatory++;
			}
		}

		// 出力
		System.out.println(goodObservatory);
		sc.close();
	}
}
