import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	// プレイヤー人数の取得、手札の数、色の種類の数、色の種類の設定
    	int playersNum = sc.nextInt();
    	int cardNum = 9;
    	int colorNum = 3;
    	int[] numType = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    	char[] colorType = {'R', 'B', 'G'};
    	int pair = 3;

    	// 人数分の勝利条件を満たしているか判定
    	// 勝利条件：judg > 3
    	for(int i = 0; i < playersNum; i++) {
    		int judg = 0;
    		// プレイヤーiの手札の数字を配列に追加
    		int[] number = new int[cardNum];
    		for(int j = 0; j < cardNum; j++) {
    			number[j] = sc.nextInt();
    		}
    		// プレイヤーiの手札の色を配列に追加
    		char[] color = new char[cardNum];
    		for(int j = 0; j < cardNum; j++) {
    			color[j] = sc.next().charAt(0);
    		}

    		// 勝利条件を満たしているか判定
    		for(int j = 0; j < colorNum; j++) {
    			// 同一色の数字をリストに入れる
    			ArrayList<Integer> sameColor = new ArrayList<Integer>();
    			for(int k = 0; k < cardNum; k++) {
    				if(colorType[j] == color[k]) {
    					sameColor.add(number[k]);
    				}
    			}

    			// 同一色内で同じ数字をカウント
    			for(int k = 0; k < numType.length; k++) {
    				int count = 0;
    				for(int l = 0; l < sameColor.size(); l++) {
    					if(numType[k] == sameColor.get(l)) {
    						count++;
    						if(count == pair) {
    							judg++;
    							for(int m = 0; m < pair; m++) {
    								sameColor.remove(sameColor.indexOf(numType[k]));
    							}
    							break;
    						}
    					}
    				}
    			}

    			// 同一色内で連番数字をカウント
    			Collections.sort(sameColor);
    			while(sameColor.size() != 0) {
    				int a = sameColor.get(0);
    				int count = 0;
    				int count0 = 0;
    				for(int l = 0; l < sameColor.size(); l++) {
    					if(a == sameColor.get(l)) {
    						count++;
    						a++;
    					}
    					if(count == pair) {
    						count0++;
    						judg++;
    						for(int m = 0; m < pair; m++) {
    							a--;
								sameColor.remove(sameColor.indexOf(a));
							}
    						break;
    					}
    				}
    				if(count0 == 0) break;
    			}

    		}

    		// 勝利条件を満たしていれば1を出力、elseは0を出力
    		if(judg >= 3) {
    			System.out.println(1);
    		}else {
    			System.out.println(0);
    		}
    	}
    }
}
