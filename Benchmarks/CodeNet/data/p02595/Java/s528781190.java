import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int d = sc.nextInt();
		ArrayList<double[]> array = new ArrayList<double[]>();

		// 整数の取得
		for (int i = 0; i < n - 1; i++) {
			double[] vals = new double[2];
			vals[0] = sc.nextInt();
			vals[1] = sc.nextInt();
			array.add(vals);
		}

		//計算
		int cnt = 0;
		int j = 0;

        while (array.size() > j) {
        	double[] vals = array.get(j);
			if(Math.round(Math.sqrt((vals[0] * vals[0]) + (vals[1] * vals[1]))) <= d){
				cnt++;
			}
			j++;
			vals = null;
        }

		System.out.println(cnt);

		sc.close();
	}
}
