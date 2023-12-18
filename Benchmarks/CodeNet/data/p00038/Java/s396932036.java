/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int[] card = new int[5];
			String str = scan.next();
			for(int i = 0;i < 4;i++){
				card[i] = Integer.parseInt(str.substring(0,str.indexOf(",")));
				str = str.substring(str.indexOf(",") + 1,str.length());
			}
			card[4] = Integer.parseInt(str);
			System.out.println(Poker.yaku(card));
		}
	}
	


}

class Poker {
	static String yaku(int[] card) { // cardに格納するのは1~13の数字のみとする
		int[] cardNum = new int[13];
		for (int i = 0; i < 5; i++) {
			cardNum[card[i] - 1]++; // ここで -1 とするのは要素番号に沿わせるため
		}
		if (jFourcard(cardNum)) {
			return "four card";
		}
		else if (jFullhouse(cardNum)) {
			return "full house";
		}
		else if (jStraight(cardNum)) {
			return "straight";
		}
		else if (jThreecard(cardNum)) {
			return "three card";
		}
		else if (jTwopair(cardNum)) {
			return "two pair";
		}
		else if (jOnepair(cardNum)) {
			return "one pair";
		}
		return "null";

	}

	static boolean jFourcard(int[] cardNum) {
		for (int i = 0; i < 13; i++) {
			if (cardNum[i] == 4) {
				return true;
			}
		}
		return false;
	}

	static boolean jFullhouse(int[] cardNum) {
		boolean b1 = false, b2 = false;
		for (int i = 0; i < 13; i++) {
			if (cardNum[i] == 2) {
				b1 = true;
			} else if (cardNum[i] == 3) {
				b2 = true;
			}
		}
		return b1 && b2;
	}

	static boolean jStraight(int[] cardNum) {
		for (int i = 0; i < 9; i++) {
			if (cardNum[i] == 1 && cardNum[i + 1] == 1 && cardNum[i + 2] == 1
					&& cardNum[i + 3] == 1 && cardNum[i + 4] == 1) {
				return true;
			}
		}
		if (cardNum[9] == 1 && cardNum[10] == 1 && cardNum[11] == 1
				&& cardNum[12] == 1 && cardNum[0] == 1) {
			return true;
		}
		return false;
	}

	static boolean jThreecard(int[] cardNum) { // これはフルハウスを使用後に使用するべきメソッド
		for (int i = 0; i < 13; i++) {
			if (cardNum[i] == 3) {
				return true;
			}
		}
		return false;
	}

	static boolean jTwopair(int[] cardNum) {
		int cnt = 0;
		for (int i = 0; i < 13; i++) {
			if (cardNum[i] == 2) {
				cnt++;
			}
		}
		return cnt == 2;
	}

	static boolean jOnepair(int[] cardNum) {
		for (int i = 0; i < 13; i++) {
			if (cardNum[i] == 2) {
				return true;
			}
		}
		return false;
	}
}