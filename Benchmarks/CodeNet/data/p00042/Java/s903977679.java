import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int VALUE = 0;
	public static final int WEIGHT = 1;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int numOfData = 0;
		while(w != 0){
			numOfData++;
			int n = sc.nextInt();
			int[][] trs = new int[n][2];
			for(int i = 0; i < n; i++){
				String str = sc.next();
				String[] s = str.split(",");
				trs[i][VALUE] = Integer.parseInt(s[0]);
				trs[i][WEIGHT] = Integer.parseInt(s[1]);
			}
			//print(trs,n);
			//ソートしてみる
			Arrays.sort(trs, new MyComparator());
			//print(trs,n);
			int[] per = new int[w];
			boolean[][] used = new boolean[w][n];
			int maxID = 0;

			for(int i = 1; i <= w; i++){
				int index = i - 1;
				//その重さでの最大の価値を求める
				for(int j = 0; j < n; j++){
					int wg = trs[j][WEIGHT];
					if(wg > i){
						//重さが既に超えていたら
						break;
					}
					if(i - wg > 0){
						int ind = index - wg;
						if(used[ind][j] == false){
							if(per[ind] + trs[j][VALUE] > per[index]){
								per[index] = per[ind] + trs[j][VALUE];
								for(int k = 0; k < n; k++){
									used[index][k] = used[ind][k];
								}
								used[index][j] = true;
							}
						}
					}
					else{
						if(trs[j][VALUE] > per[index]){
							per[index] = trs[j][VALUE];
							Arrays.fill(used[index], false);
							used[index][j] = true;
						}
					}

				}
				if(per[maxID] < per[index]){
					maxID = index;
				}
				//System.out.println(i + " : value = " + per[index]);
			}

			//完成？
			System.out.println("Case " + numOfData + ":");
			System.out.println(per[maxID]);
			System.out.println(maxID + 1);

			w = sc.nextInt();
		}
	}

	public static void printTRS(int[][] trs, int n){
		for(int i = 0; i < n; i++){
			System.out.println(i + " : value = " + trs[i][VALUE] + ", weight = " + trs[i][WEIGHT]);
		}
	}

}

//@SuppressWarnings("unchecked")
class MyComparator implements Comparator{
	public MyComparator(){

	}
	public int compare(Object arg0, Object arg1) {
		// TODO 自動生成されたメソッド・スタブ
		int n1 = ((int[])arg0)[1];
		int n2 = ((int[])arg1)[1];
		return n1 < n2 ? -1 : 1;
	}
}