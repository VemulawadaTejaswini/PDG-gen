import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		// ?????°???????????????
		int T = scan.nextInt();
		// ?????°?????°?????????
		for(int Ti=0; Ti<T; Ti++) {
			int check = 0;
			int check2 = 0;
			//?????°??????????????????
			int n[] = new int[9];
			for (int i=0; i<9; i++){
				n[i] = scan.nextInt();
			}
			// ??????????????????
			String c[] = new String[9];
			for (int i=0; i<9; i++){
				c[i] = scan.next();
			}
			//??????????????????????????????
			ArrayList<Card> cardList = new ArrayList<Card>();
			for (int i = 0; i<9; i++) {
				// ??????????????????????????????
				String x = c[i];
				int y = n[i];
				Card card = new Card(x, y);
				// ?????????????????????????????????
				cardList.add(card);
			}
			//??????????????????????????????
			Collections.sort(cardList);
			// memo
			boolean colorCheck = true;
			String color ="";
			//???????????\?????¨????????????????¢??????????
			for (int i = 0; i < cardList.size(); i=i+3){
				Card card1 = cardList.get(i);
				Card card2 = cardList.get(i+1);
				Card card3 = cardList.get(i+2);
				int cardNo1 = card1.get_number();
				int cardNo2 = card2.get_number();
				int cardNo3 = card3.get_number();
				int cardCn1 = card1.get_colorNum();
				int cardCn2 = card2.get_colorNum();
				int cardCn3 = card3.get_colorNum();
				//??????????????????????¢????
				if((cardCn1 == cardCn2) && (cardCn1 == cardCn3)) {
					color = color + String.valueOf(cardCn1);
					// ??°???????¢???????????????¨???????????°
					if((cardNo1 == cardNo2) && (cardNo1 == cardNo3)) {
						check = check + 1;
					}
					else if ((cardNo2 == (cardNo1 + 1)) && (cardNo3 == (cardNo1 + 2))) {
						check = check + 1;
					}
				}
				// ???????????£??????????????¨???
				else {
					colorCheck = false;
					break;
				}
			}
			if ((colorCheck != false) && (check != 3)) {
				// ??????????????°???????????????????´?
				int cardNo[] = new int[9];
				for (int i = 0; i<cardList.size(); i++) {
					Card card = cardList.get(i);
					cardNo[i] = card.get_number();
				}
				// 2????????????????????¨???1
				if ((color.equals("011"))||(color.equals("122"))||(color.equals("022"))) {
					// ??°???????¢????
					if(((cardNo[0] == cardNo[1]) && (cardNo[0] == cardNo[2])) || ((cardNo[1] == (cardNo[0] + 1)) && (cardNo[2] == (cardNo[0] + 2)))) {
						check2 = check2 + 1;
					}
					if ((cardNo[3] == cardNo[4]) && ((cardNo[4]+1) == cardNo[5]) && (cardNo[5] == cardNo[6]) && ((cardNo[6]+1) == cardNo[7]) && (cardNo[7] == cardNo[8])) {
						check2 = check2 + 2;
					}
					else if (((cardNo[3]+1) == cardNo[4]) && (cardNo[4] == cardNo[5]) && ((cardNo[5]+1) == cardNo[6]) && (cardNo[6] == cardNo[7]) && ((cardNo[7]+1) == cardNo[8])) {
						check2 = check2 + 2;
					}
					else if (((cardNo[3]+1) == cardNo[4]) && (cardNo[4] == cardNo[5]) && (cardNo[5] == cardNo[6]) && (cardNo[6] == cardNo[7]) && ((cardNo[7]+1) == cardNo[8])) {
						check2 = check2 + 2;
					}
					else if((cardNo[3]==cardNo[3]) && ((cardNo[4]+1) == cardNo[5]) && (cardNo[5]==cardNo[6]) && ((cardNo[6]+1) == cardNo[7]) && (cardNo[7]==cardNo[8])){
						check2 = check2 + 2;
					}
				}
				// 2????????????????????¨???2
				else if ((color.equals("001")) || (color.equals("112")) || (color.equals("002"))) {
					if ((cardNo[0] == cardNo[1]) && ((cardNo[1]+1) == cardNo[2]) && (cardNo[2] == cardNo[3]) && ((cardNo[3]+1) == cardNo[4]) && (cardNo[4] == cardNo[5])) {
						check2 = check2 + 2;
					}
					if (((cardNo[0]+1) == cardNo[1]) && (cardNo[1] == cardNo[2]) && ((cardNo[2]+1) == cardNo[3]) && (cardNo[3] == cardNo[4]) && ((cardNo[4]+1) == cardNo[5])) {
						check2 = check2 + 2;
					}
					else if (((cardNo[0]+1) == cardNo[1]) && (cardNo[1] == cardNo[2]) && (cardNo[2] == cardNo[3]) && (cardNo[3] == cardNo[4]) && ((cardNo[4]+1) == cardNo[5])) {
						check2 = check2 + 2;
					}
					else if((cardNo[0]==cardNo[1]) && ((cardNo[1]+1) == cardNo[2]) && (cardNo[2]==cardNo[3]) && ((cardNo[3]+1) == cardNo[4]) && (cardNo[4]==cardNo[5])){
						check2 = check2 + 2;
					}
					else if(((cardNo[6] == cardNo[7]) && (cardNo[6] == cardNo[8])) || ((cardNo[7] == (cardNo[6] + 1)) && (cardNo[8] == (cardNo[6] + 2)))) {
						check2 = check2 + 1;
					}
				}
				// 3?????¨?????????????????¨???
				else if ((color.equals("000")) || (color.equals("111")) || (color.equals("222"))) {
					if((cardNo[0]==cardNo[1]) && ((cardNo[1]+1)==cardNo[2]) && (cardNo[2]==cardNo[3]) && (cardNo[3]==cardNo[4]) && ((cardNo[4]+1)==cardNo[5]) && (cardNo[5]==cardNo[6]) && (cardNo[6]==cardNo[7]) && ((cardNo[7]+1)==cardNo[8])) {
						check2 = 3;
					}
					// 1-2
					else if(((cardNo[0] == cardNo[1]) && (cardNo[0] == cardNo[2])) || ((cardNo[1] == (cardNo[0] + 1)) && (cardNo[2] == (cardNo[0] + 2)))) {
						check2 = check2 + 1;
						if ((cardNo[3] == cardNo[4]) && ((cardNo[4]+1) == cardNo[5]) && (cardNo[5] == cardNo[6]) && ((cardNo[6]+1) == cardNo[7]) && (cardNo[7] == cardNo[8])) {
							check2 = check2 + 2;
						}
						else if (((cardNo[3]+1) == cardNo[4]) && (cardNo[4] == cardNo[5]) && ((cardNo[5]+1) == cardNo[6]) && (cardNo[6] == cardNo[7]) && ((cardNo[7]+1) == cardNo[8])) {
							check2 = check2 + 2;
						}
						else if (((cardNo[3]+1) == cardNo[4]) && (cardNo[4] == cardNo[5]) && (cardNo[5] == cardNo[6]) && (cardNo[6] == cardNo[7]) && ((cardNo[7]+1) == cardNo[8])) {
							check2 = check2 + 2;
						}
						else if((cardNo[3]==cardNo[3]) && ((cardNo[4]+1) == cardNo[5]) && (cardNo[5]==cardNo[6]) && ((cardNo[6]+1) == cardNo[7]) && (cardNo[7]==cardNo[8])){
							check2 = check2 + 2;
						}
					}
					// 2-1
					else if ((cardNo[0] == cardNo[1]) && ((cardNo[1]+1) == cardNo[2]) && (cardNo[2] == cardNo[3]) && ((cardNo[3]+1) == cardNo[4]) && (cardNo[4] == cardNo[5])) {
						check2 = check2 + 2;

						if (((cardNo[0]+1) == cardNo[1]) && (cardNo[1] == cardNo[2]) && ((cardNo[2]+1) == cardNo[3]) && (cardNo[3] == cardNo[4]) && ((cardNo[4]+1) == cardNo[5])) {
							check2 = check2 + 2;
						}
						else if (((cardNo[0]+1) == cardNo[1]) && (cardNo[1] == cardNo[2]) && (cardNo[2] == cardNo[3]) && (cardNo[3] == cardNo[4]) && ((cardNo[4]+1) == cardNo[5])) {
							check2 = check2 + 2;
						}
						else if((cardNo[0]==cardNo[1]) && ((cardNo[1]+1) == cardNo[2]) && (cardNo[2]==cardNo[3]) && ((cardNo[3]+1) == cardNo[4]) && (cardNo[4]==cardNo[5])){
							check2 = check2 + 2;
						}
						else if(((cardNo[6] == cardNo[7]) && (cardNo[6] == cardNo[8])) || ((cardNo[7] == (cardNo[6] + 1)) && (cardNo[8] == (cardNo[6] + 2)))) {
							check2 = check2 + 1;
						}
					}
				}
			}
			//System.out.println("color : " + color + "  check1 :" + check + " , check2 :" + check2);
			//???????????????????????£???????????°1???????????£?????????????????°0???????????????
			if((check==3) || (check2>=3)) System.out.println(1);
			else System.out.println(0);
		}

	}
}

/**
 * ??????????????????
 */
class Card implements Comparable<Card> {
	/**
	* @return _number
	*/
	public int get_number() {
		return _number;
	}
	/**
	* @param _number ??????????????? _number
	*/
	public void set_number(int _number) {
		this._number = _number;
	}
	/**
	* @return _colorNum
	*/
	public int get_colorNum() {
		return _colorNum;
	}
	/**
	* @param _colorNum ??????????????? _colorNum
	*/
	public void set_colorNum(int _colorNum) {
		this._colorNum = _colorNum;
	}
	/** ??°??? */
	private int _number;
	/** ????????????R:0 G:1 B:2??? */
	private int _colorNum;
	/**
	* ?????????????????????
	* @param color ????????¨????????????
	* @param num ???????????????
	*/
	public Card(String color, int num) {
		switch(color) {
			case "R": this._colorNum = 0; break;
			case "G": this._colorNum = 1; break;
			case "B": this._colorNum = 2; break;
		}
		this._number = num;
	}
	@Override
	public int compareTo(Card arg0) {
		if(this._colorNum == arg0.get_colorNum()) {
			return this._number - arg0.get_number();
		} else {
			return this._colorNum - arg0.get_colorNum();
		}
	}
}