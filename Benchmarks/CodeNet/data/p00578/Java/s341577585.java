import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int len = sc.nextInt();
			long[] orthometric = new long[len];  //海抜
			Set<Long> sea = new TreeSet<Long>();
			long now = 0l;
			sea.add(0l);  //最初は0から始まる
			int pointer = 0;
			for (int i=0; i<len; i++) {
				long a = sc.nextLong();  //海抜を読み込み
				if (a != now) {  //隣が同じ高さだと無視
					orthometric[pointer] = a;  //海抜を読み込み
					sea.add(a);  //海の変化を読み込み
					now = a;
					pointer++;
				}
			}
			int max = 0;
			int first = 0;
			boolean first_flag = false;
			for (long i : sea) {
				int count = 0;
				boolean landflag = false;
				for (int j=first; j<pointer; j++) {
					if (orthometric[j]>i) {  //陸地であれば
						if (!first_flag) {
							 first = j;  //先頭が沈没した場合次からスキップできる
							 first_flag = true;
						}
						landflag = true;  //flag起動
					} else {
						if (landflag) {  //ここまでが一つの島
							landflag = false;
							count++;
						}
					}
				}
				if (landflag) count++;  //最後まで島だったら+1
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}
}
