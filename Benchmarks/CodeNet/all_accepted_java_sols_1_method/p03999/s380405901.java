//ビット演算
/**ヒント
StringBuilder/setLength(int newLength):引数に0を渡すと実質配列の中身を全消去できる
Long/parseLong(String s):sを10進数long型にして返す
各要素にある桁の数字を格納したchar配列を文字列にしてから数字に直す方法
char[]としてではなく、StrintBuliderとして宣言しないとsetLength()とか使えない
a={'1', '2', '3'}のときstring.valueOf(a)により"123"となる
Long.parseLong(String.valueOf(a))
*/
import java.util.*;

public class Main{
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		//char[] Sary = new char[S.length()];
		StringBuilder Sary = new StringBuilder();
		long sum = 0;//'+'を入れる各パターン数だけsumがある.
		long Allsum = 0;//各sumを足し合わせて結果をおいとく、1つだけ.

		for(long i = 0; i < Math.pow(2, S.length()-1); i++){
			sum = 0;
			int k = 0;//Sのidx
			Sary.append(S.charAt(k));
			for(long j = 0; j < S.length()-1; j++){
				k++;
				//Saryの中身を取り出して数字にして足す場合
				if((1 & i>>j) == 1){
					sum += Long.parseLong(String.valueOf(Sary));
					Sary.setLength(0);
				}
				Sary.append(S.charAt(k));
			}
			sum += Long.parseLong(String.valueOf(Sary));
			//出した合計を全体の合計に足す
			Allsum += sum;
      Sary.setLength(0);
		}

		System.out.println(Allsum);
  }
}