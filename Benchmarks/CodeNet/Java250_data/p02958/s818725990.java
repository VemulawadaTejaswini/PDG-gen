import java.util.*;

public class Main {
	private static final String TEST = "7 1 2 3 4 5 6 7";
	Scanner sc;
	
	int N;
	int[] p;
	
/*-------------
 * constructor
 */
	public Main() {
		sc = new Scanner(System.in);
	}
	public Main(String input) {
		sc = new Scanner(input);
	}
	
/*------------------
 * instance methods
 */
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public void exec() throws Exception {
		N = sc.nextInt();
		p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		
		int[] descendIndex = new int[3];
		int descendCnt = 0;
		
		for (int i = 0; i < N-1; i++) {
			if (p[i] > p[i+1]) { // 逆順
				descendIndex[descendCnt++] = i;
				if (descendCnt > 2) break;
			}
		}
//		for (int i = 0; i < N; i++) {
//			System.out.print(p[i]+" ");
//		}
//		System.out.println();
//		System.out.println("cnt : "+descendCnt);
//		for (int i = 0; i < descendCnt; i++) {
//			System.out.println(i + ":" + descendIndex[i]);
//		}
		
		int i, j;
		switch (descendCnt) {
		
		case 0:
			out("YES");
			break;
		
		case 1:	// この位置 p[i] と p[i+1] を変えてできればYES
			i = descendIndex[0];
			// p[i-1] ● p[i+1] p[i] ● p[i+2] が昇順ならYES
			if (i != 0) { // 左端でない→左があるので比較する
				if (p[i-1] > p[i+1]) {
					out("NO"); // ダメ
					return;
				}
			}
			if (i < N-2) { // 右端でない→右があるのでそれと比較
				if (p[i] > p[i+2]) {
					out("NO");
					return;
				}
			}
			out("YES");
			return;
		
		case 2: // 離れて２か所ある部分を入れ替えてできればYES
			i = descendIndex[0];
			j = descendIndex[1]; // i < j
			// i と j+1 が入れ替え対象
			// p[i-1] p[j+1] p[i+1] .... p[j] p[i] p[j+2]
			// が昇順であれば YES となる必要十分
			if (i != 0) {
				if (p[i-1] > p[j+1]) {
					out("NO");
					return;
				}
			}
			if (p[j+1] > p[i+1]) {
				out("NO");
				return;
			}
			if (j+1 < N-1) {
				if (p[i] > p[j+2]) {
					out("NO");
					return;
				}
			}
			if (p[j] > p[i]) {
				out("NO");
				return;
			}
			out("YES");
			return;
		
		default:	// 3箇所以上はNO
			out("NO");
			return;
		}
	}
	
/*------
 * main
 */
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}
}

	