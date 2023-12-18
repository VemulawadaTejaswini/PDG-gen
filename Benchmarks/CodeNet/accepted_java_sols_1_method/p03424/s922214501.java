
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
問題文
日本では、3 月 3 日にひなあられという、色のついたお菓子をお供えする習慣があります。

1 つの袋があり、ひなあられが N 個入っています。

この袋には、桃色、白色、緑色の 3 種類か、桃色、白色、緑色、黄色の 4 種類のひなあられが入っていることが分かっています。

桃色を P、白色を W、緑色を G、黄色を Y と表したとき、袋からひなあられを 1 粒ずつ取り出していったところ、i 番目に取り出したひなあられの色は Si でした。

この袋に 3 種類のひなあられが入っていた場合は Three、4 種類のひなあられが入っていた場合は Four と出力してください。

制約
1≤N≤100
Si は P か W か G か Y
Si=P、Sj=W、Sk=G を満たす i,j,k が必ず存在する
入力
入力は以下の形式で標準入力から与えられる。

N
S1 S2 … SN
 *
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int N = sc.nextInt();
		List<String> stock = new ArrayList<String>();

		for(int i=0; i < N; i++) {
			String hinaarare = sc.next();
			if (stock.contains(hinaarare) == false) {
				stock.add(hinaarare);
			}
		}
		if (stock.size() == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Four");
		}
	}
}
