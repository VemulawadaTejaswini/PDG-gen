// 1 から n までの数の中から、重複無しで３つの数を選びそれらの合計が x となる組み合わせの数を求めるプログラムを作成して下さい。
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = null;
		String[] spl = new String[2];
		int i, j, k;
		int n, x, comp;
		int result = 0;

		while(true){
			result = 0;
			str = scan.nextLine();
			spl = str.split(" ");
			n = Integer.parseInt(spl[0]);
			x = Integer.parseInt(spl[1]);

			if(n==0 && x==0){
				break;
			}
			// 3重ループで重複なしでの足し算組み合わせ特定、カウンタを1増やす
			for(i=1; i<n; i++){
				for(j=(i+1); j<n; j++){
					for(k=(j+1); k <= n; k++){
						comp = x - (i + j);
						if (k == comp){
							result++;
						}
					}
				}
			}
			System.out.println(result);
		}
	}
}
