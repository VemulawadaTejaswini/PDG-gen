import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	// カードの色をチェックし、手役になりうるかをチェック
	public boolean checkColor(ArrayList<HashMap<String, String>> hand) {
		// R, G, Bそれぞれの数
		int red = 0;
		int green = 0;
		int blue = 0;
		for(HashMap<String, String> card : hand) {
			if(card.get("color").equals("R")) red++;
			else if(card.get("color").equals("G")) green++;
			else if(card.get("color").equals("B")) blue++;
		}
		//		System.out.println("red : " + red);
		//		System.out.println("green : " + green);
		//		System.out.println("blue : " + blue);
		// それぞれが３の倍数ならOK
		if(red % 3 == 0 && green % 3 == 0 && blue % 3 == 0) {
			//			System.out.println(1);
			return true;
		} else {
			//			System.out.println(0);
			return false;
		}
	}

	// 1ブロック文のカードの組み合わせを全パターン抽出
	public Integer[][] createPattern(ArrayList<HashMap<String, String>> hand) {

		// 3枚ずつのブロックを作る
		// 0ブロック目にいれるか、1ブロック目にいれるか、2ブロック目にいれるか
		// それぞれの割り当て番号は３つずつしか使ってはいけないので、それぞれ管理する

		//		Integer[] ret;

		Integer[][] selected = new Integer[999][999]; // すでに選択した組み合わせ
		int selectedIte = 0;

		// とりあえず重複なしで3つ取り出す
		// 出力しているのは要素番号
		// 1つめ
		//		int count=0;
		for(int i=0; i<hand.size(); i++) {
			// 2つめ
			for(int j=0; j<hand.size(); j++) {
				// 重複したカードは選択しない
				if(i == j) continue;
				// 3つめ
				for(int k=0; k<hand.size(); k++) {
					// 重複したカードは選択しない
					if(j == k || i==k) continue;
					// すでに取得している組み合わせも選択しない
					Integer[] addList = {i, j, k};
					if(checkDuplicate(selected, addList)) continue;
					selected[selectedIte] = addList;
					selectedIte++;
					//					System.out.print(i + " " + j + " " + k + ", ");
					//					count++;
					//					ret = {i, j, k};
					//					return ret;
				}
			}
			//			System.out.println("");
		}

		//		System.out.println(count);

		return selected;

	}

	// 2次元配列の要素に特定の配列が入っているか(順不同)
	// checkArrは３つで固定
	private boolean checkDuplicate(Integer[][] arr, Integer[] checkArr) {

		for(int i=0; i<arr.length; i++) {
			if(Arrays.asList(arr[i]).contains(checkArr[0]) && Arrays.asList(arr[i]).contains(checkArr[1]) && Arrays.asList(arr[i]).contains(checkArr[2])) {
				return true;
			}
		}

		return false;

	}

	// 2つの配列の要素の内容は同じか
	public boolean checkDuplicate2(Integer[] arr, Integer[] checkArr) {

		// 比較するためにソート
		Arrays.sort(arr);
		Arrays.sort(checkArr);

		if(Arrays.equals(arr, checkArr)) return true;
		else return false;

	}

	// １つめの配列に２つめの配列の要素が含まれていないか
	public boolean checkDuplicate3(Integer[] arr, Integer[] checkArr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<checkArr.length; j++) {
				if(arr[i] == checkArr[j]) return false;
			}
		}

		return true;

	}

	// カードの組み合わせを全パターン抽出
	public ArrayList<Integer[][]> createPattern2(ArrayList<HashMap<String, String>> hand) {

		// 1ブロックごと取得し、取得済の値を配列から取り除いて再度組み合わせを取得する
		// 3つのブロックを作るのでカウントを設定

		// 値が重複していないブロックを探し手札とする
		//		Integer[][][] hands = new Integer[99999][3][3]; // パターン数、ブロック数、1ブロックあたりのカード数
		ArrayList<Integer[][]> hands = new ArrayList<>();
		//		int handsIte = 0;
		// １ブロックの全パターン
		Integer[][] blockPatterns = createPattern(hand);

		//		System.exit(1);

		int blockPatternsNum = 84;

		int count = 0;
		for(int i=0; i<blockPatternsNum; i++) {
			for(int j=0; j<blockPatternsNum; j++) {
				// 1番目の配列に2番目の配列の各要素が入っていないかチェック
				if(!checkDuplicate3(blockPatterns[i], blockPatterns[j])) continue;
				for(int k=0; k<blockPatternsNum; k++) {
					// 1番目の配列に3番目の配列の各要素が入っていないかチェック
					if(!checkDuplicate3(blockPatterns[i], blockPatterns[k])) continue;
					// 2番目の配列に3番目の配列の各要素が入っていないかチェック
					if(!checkDuplicate3(blockPatterns[j], blockPatterns[k])) continue;


					//					System.out.println(count);
					count++;

					// 組み合わせを追加
					Integer[][] h = new Integer[3][3];
					h[0] = blockPatterns[i];
					h[1] = blockPatterns[j];
					h[2] = blockPatterns[k];
					hands.add(h);
				}
			}
		}

		return hands;

		// debug
		//		for(int i=0; i<hands.size(); i++) {
		//			for(int j=0; j<3; j++) {
		//				for(int k=0; k<3; k++) {
		//					// 1ブロック表示
		//					System.out.print(hands.get(i)[j][k] + " ");
		//				}
		//				System.out.print(", ");
		//			}
		//			System.out.println("");
		//		}

	}

	// 役になっているかの判断
	public boolean checkHand(ArrayList<HashMap<String, String>> hand) {

		// 色が同じか３つずつ判定する
		for(int i=0; i<9; i+=3) {
			//			for(int j=i; j<3; j++) {
			if(!hand.get(i).get("color").equals(hand.get(i+1).get("color")) || !hand.get(i+1).get("color").equals(hand.get(i+2).get("color")) || !hand.get(i).get("color").equals(hand.get(i+2).get("color"))) {
				return false;
			}
			//			}
		}

		// 番号でソートし、数値が並んでいる、または同じ数値なことを確認
		// 3つずつソート
		for(int i=0; i<9; i+=3) {
			ArrayList<HashMap<String, String>> sortBlock = new ArrayList<>();
			sortBlock.add(hand.get(i));
			sortBlock.add(hand.get(i+1));
			sortBlock.add(hand.get(i+2));
			sortBlock = sortBlock(sortBlock);
			// 数値を比較
			int num1 = Integer.parseInt(sortBlock.get(0).get("num"));
			int num2 = Integer.parseInt(sortBlock.get(1).get("num"));
			int num3 = Integer.parseInt(sortBlock.get(2).get("num"));
			if(!(num1 == num2 && num2 == num3 || num1+1 == num2 && num2+1 == num3)) return false;
			//			System.out.println("");
		}


		return true;

	}

	// 手役の1ブロックをソート
	private ArrayList<HashMap<String, String>> sortBlock(ArrayList<HashMap<String, String>> handBlock) {

		ArrayList<HashMap<String, String>> ret = new ArrayList<>();
		ret = handBlock;

		for(int i=0; i<ret.size()-1; i++) {
			for(int j=ret.size()-1; j > i; j--) {
				if(Integer.parseInt(ret.get(j-1).get("num")) > Integer.parseInt(ret.get(j).get("num"))) {
					HashMap<String, String> buf = ret.get(j-1);
					ret.set(j-1, ret.get(j));
					ret.set(j, buf);
				}
			}
		}

		return ret;

	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int handNum = 9; // 手札の数
		int cardNum = sc.nextInt();

		int[] nums = new int[9];
		for(int k=0; k<cardNum; k++) {
			ArrayList<HashMap<String, String>> cardList = new ArrayList<>();
			for(int i=0; i<9; i++) {
				nums[i] = sc.nextInt();
			}
			for(int i=0; i<9; i++) {
				String color = sc.next();
				HashMap<String, String> card = new HashMap<>();
				card.put("num", String.valueOf(nums[i]));
				card.put("color", color);
				cardList.add(card);
			}

			// 手札をセット
			ArrayList<HashMap<String, String>> hand = new ArrayList<>();
			for(int i=0; i<handNum; i++) {
				hand.add(cardList.get(i));
			}

			Main r = new Main();

			// それぞれのカードの色を確認し、手役になりうるかのチェック
			if(!r.checkColor(hand)) {
				System.out.println(0);
				continue;
//				break;
			}

			// 全パターンを抽出
			r.createPattern(hand);

			ArrayList<Integer[][]> handList = r.createPattern2(hand);

			int okFlag = 0;

			// リストをもとに役になっているのか判断
			// 手役を渡す
			for(Integer[][] h : handList) {
				// 判定する手役生成
				ArrayList<HashMap<String, String>> checkHand = new ArrayList<>();
				for(int i=0; i<3; i++) {
					checkHand.add(hand.get(h[i][0]));
					checkHand.add(hand.get(h[i][1]));
					checkHand.add(hand.get(h[i][2]));
				}

				// 手役判定を行う
				if(r.checkHand(checkHand)) {
					okFlag = 1;
					break;
					//				for(HashMap<String, String> card : checkHand) {
					//					System.out.print(card.get("num") + card.get("color") + ", ");
					//				}
					//				System.out.println("");
					//				System.out.println("OK");
				}


				// debug
				//			for(HashMap<String, String> card : checkHand) {
				//				System.out.print(card.get("num") + card.get("color") + ", ");
				//			}
				//			System.out.println("");

			}

			System.out.println(okFlag);

		}
		sc.close();

	}

}
