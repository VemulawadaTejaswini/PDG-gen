import java.io.*;
public class Main {
	/**
	 * 不足しているカードの発見
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//カードの枚数を入力
		int n = Integer.parseInt(br.readLine());
		//トランプ全てのの配列
		String[] strs = new String[52];
		//カードの有無の配列
		Boolean[] judes = new Boolean[52];
		//スートの配列
		String[] suit = {"S","H","C","D"};
		//有無の配列にまず全て無い状態にする
		for(int i = 0; i < suit.length; i++){
			for(int l = 1; l <= 13; l++){
				strs[i * 13 + l - 1] = suit[i] + " " + l;
				judes[i * 13 + l - 1] = false;
			}//for
		}//for
		//入力されたカードを有る状態に刷る
		for(int i = 0; i < n; i++){
			String str = br.readLine();
			for(int l = 0; l < strs.length; l++){
				if(str.equals(strs[l])){
					judes[l] = true;
					break;
				}//if
			}//for
		}//for
		//無いカードを表示する
		for(int i = 0; i < judes.length; i++){
			if(!judes[i]){
				System.out.println(strs[i]);
			}//if
		}//for
	}
}