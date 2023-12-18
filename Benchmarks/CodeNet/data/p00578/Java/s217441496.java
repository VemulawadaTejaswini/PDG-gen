import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Main {

	static long[] orthometric;  //海抜
	static Long[] sea;  //海の変化
	static int num = 0;  //配列の長さ

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int len = sc.nextInt();
			orthometric = new long[len];  //海抜
			TreeSet<Long> seas = new TreeSet<Long>();
			long now = 0l;
			seas.add(0l);  //最初は0から始まる
			for (int i=0; i<len; i++) {
				long a = sc.nextLong();  //海抜を読み込み
				if (a != now) {  //隣が同じ高さだと無視
					orthometric[num] = a;  //海抜を読み込み
					seas.add(a);  //海の変化を読み込み
					now = a;
					num++;
				}
			}
			sea = new Long[seas.size()];
			seas.toArray(sea);  //配列にする
			List<int[]> land = new ArrayList<int[]>();
			land.add(new int[]{0,num});  //最初は全部
			int max = findLand(0, land);
			System.out.println(max);
		}
	}

	public static int findLand(int max, List<int[]> land) {
		int pointer = 0;
		while (pointer<sea.length) {			
			int count = 0;
			boolean landflag = false;
			int[] newLand = new int[2];
			List<int[]> l = new ArrayList<int[]>();
			for (int[] j : land) {
				//System.out.println("land-----"+land.size());
				for (int k=j[0]; k<j[1]; k++) {
					//System.out.println(pointer+"-----"+j[0]+"/"+j[1]);
					if (orthometric[k]>sea[pointer]) {  //陸地であれば
						if (!landflag) {
							landflag = true;  //flag起動
							newLand[0] = k;  //新しい島のスタート
						}
					} else {
						if (landflag) {  //ここまでが一つの島
							landflag = false;
							count++;
							newLand[1] = k;  //新しい島のエンド
							l.add(newLand);
							//System.out.println("added:" + newLand[0]+"/"+newLand[1]);
						}
					}
				}
				if (landflag) { //最後まで島だったら
					 count++;
					 newLand[1] = num;
					 l.add(newLand);
					// System.out.println("added:" + newLand[0]+"/"+newLand[1]);
				}
				max = Math.max(max, count);
				land = new ArrayList<int[]>(l);
			}
			pointer++;
		}
		return max;
	}
}
