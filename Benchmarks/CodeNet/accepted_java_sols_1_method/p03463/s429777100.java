/*
 * N 個のマスに区切られた細長い紙切れの上でゲームを行います。マスには 1 から N までの番号が順に付けられています。
 * 
 * アリスの駒はマス A に、ボリスの駒は別のマス B に置かれています。
 * 
 * 二人にはターンが交互に訪れます。アリスが先手です。 ターンが回ってきたプレイヤーは、自分の駒を現在のマス X から左隣のマス X−1 か右隣のマス X+1 のどちらかに動かさなければなりません。 
 * ただし、駒を紙切れの外に出したり、相手の駒と同じマスに動かしてはいけません。 また、駒の移動は一ターンに一度だけ行わなければなりません。
 * 
 * 駒を動かせなくなった人が負けで、相手の勝ちとなります。
 * 
 * 二人とも、勝ちたいと思っています。二人とも最適にプレイするとき、どちらが勝つでしょうか？
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            //出力
            if((a-b)%2 == 0){
            	System.out.println("Alice");
            }else{
            	System.out.println("Borys");
            }
            sc.close();
        }
    }
	