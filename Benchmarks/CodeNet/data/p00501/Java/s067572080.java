
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();//ボード数
		String sample = s.next();//s.next();//元となる文字
		char[] samples = new char[sample.length()];
		for(int i=0; i<samples.length; i++){//元となる文字を一文字ずつ配列へ
			samples[i] = sample.charAt(i);
		}
		String board = "";//看板の数
		int count=0;//何文字ごとか
		int muri = 2;
		int result = 0;
		do{//看板の数分だけループ
			board = s.next();
			N--;
		end: for(int i=0; i<board.length(); i++){
			if(samples[0]!=board.charAt(i)) continue;
			for(int j=i; j<board.length(); j++){
				if(samples[1]!=board.charAt(j)) continue;
				count = j-i;
				int flag = 2;
				muri = 2;
				a:for(int k=j+count; k<board.length();k+=count){
					if(samples[muri]!=board.charAt(k)){//一致しないなら前のループへ
						break a;
					}
					muri++;//次の文字へ
					flag++;//フラグ回収
					if(flag==sample.length()){
						result++;//一枚完成
						break end;//次の看板へ
					}
				}
			}
		}
		}while(N>0);
		System.out.println(result);
	}
}