import java.util.Scanner;
import java.util.Arrays;

class Main {
	private static	int num;
	private static	int[]  array;
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();//要素数
		array = new int[num];
		//配列作成
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
		}
		//計算結果を出力
		System.out.println( cost() );
		
		scanner.close();
	}
	//最小コスト
	public static int cost(){ 
		int sorted[] = array.clone();		//クローンを作って
        Arrays.sort(sorted);			//昇順にしておいて比べる
		int mincost = 0;
		int sub;
		int comp = 0;

		for(int i = 0; i < num; i ++ ){
			comp = indexOf(sorted[i]);		//比較結果
            int count = 0;
			//比較結果によって中へ
            while (comp > i) {
                count ++;								//whileの中に入った数
                sub = indexOf(sorted[comp]);	//比較結果
                mincost += array[sub];
                int work = array[comp];
                array[comp] = array[sub];
                array[sub] = work;
                comp = sub;								//比較対象をずらしていく
            }
			//値の小さいほうをコストに
            mincost += Math.min(sorted[i] * count,
            		sorted[i] * 2 + sorted[0] * (count + 2));
        }
		return mincost;
	}
	
	public static int indexOf(int comp) {
        //一致した場所を返し、一致しなかったら-1
		for (int i = 0; i < num; i++) {
            if (array[i] == comp) {
                return i;
            }
        }
        return -1;
    }
}
