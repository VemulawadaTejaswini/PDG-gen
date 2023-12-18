
import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//カードの枚数を受け取る
		String card = sc.next();
		int cn = Integer.parseInt(card);
		
		//カードのマーク別に可変長配列を作る
		ArrayList<Integer> cardS = new ArrayList<Integer>();
		ArrayList<Integer> cardH = new ArrayList<Integer>();
		ArrayList<Integer> cardC = new ArrayList<Integer>();
		ArrayList<Integer> cardD = new ArrayList<Integer>();
		
		//入力されるカード番号を受け取る
		for(int i = 0; i < cn; i++){
			String kc = sc.next();
			String s2 = sc.next();
			int c = Integer.parseInt(s2);
			
			if(kc.equals("S")){
				cardS.add(c);
			}
			else if(kc.equals("H")){
				cardH.add(c);
			}
			else if(kc.equals("C")){
				cardC.add(c);
			}
			else if(kc.equals("D")){
				cardD.add(c);
			}
		}
		
		//カードのマーク別に１から１３まで受け取った番号があるかを調べる
		//なかったらその番号を表示する
		
		//トランプのマークを識別するための文字列cs
		String cs = "S";
		//今比べている配列内の値を入れる器cb
		int cb = 0;
		for(int i = 0; i < 4; i++){
			//スペードのとき
			if(cs.equals("S")){
				for(int j = 1; j <= 13; j++){
					for(int k = 0; k < cardS.size(); k++){
						cb = cardS.get(k);
						if(j == cb){
							break;
						}
						else if(k == cardS.size() - 1 && j != cb){
							System.out.println("S" + " " + j);
						}
					}
				}
				cs = "H";
			}
			//ハートのとき
			else if(cs.equals("H")){
				for(int j = 1; j <= 13; j++){
					for(int k = 0; k < cardH.size(); k++){
						cb = cardH.get(k);
						if(j == cb){
							break;
						}
						else if(k == cardH.size() - 1 && j != cb){
							System.out.println("H" + " " + j);
						}
					}
				}
				cs = "C";
			}
			//クローバーのとき
			else if(cs.equals("C")){
				for(int j = 1; j <= 13; j++){
					for(int k = 0; k < cardC.size(); k++){
						cb = cardC.get(k);
						if(j == cb){
							break;
						}
						else if(k == cardC.size() - 1 && j != cb){
							System.out.println("C" + " " + j);
						}
					}
				}
				cs = "D";
			}
			//ダイヤのとき
			else if(cs.equals("D")){
				for(int j = 1; j <= 13; j++){
					for(int k = 0; k < cardD.size(); k++){
						cb = cardD.get(k);
						if(j == cb){
							break;
						}
						else if(k == cardD.size() - 1 && j != cb){
							System.out.println("D" + " " + j);
						}
					}
				}
			}
		}
	}

}