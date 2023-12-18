/*
 * シカのAtCoDeerくんは友達のTopCoDeerくんとあるゲームをして対戦しています。 このゲームは N ターンからなります。各ターンではそれぞれのプレイヤーはじゃんけんのグーかパーを出します。
 * ただし、各プレイヤーは次の条件を満たす必要があります。
 * 
 * (※) 各ターンの後で、(今までにパーを出した回数)≦(今までにグーを出した回数)　を満たす
 * 
 * このゲームでの各プレイヤーの得点は、(勝ったターンの数) − (負けたターンの数) です。 
 * AtCoDeerくんは特殊能力を持っているので、ゲームが始まる前にTopCoDeerくんの出す N ターンの手を全て知ることが出来ました。
 * AtCoDeerくんの各ターンでの手を決めて、AtCoDeerくんの得点を最大化してください。 TopCoDeerくんの出す手の情報は文字列 s で与えられます。
 * s の i(1≦i≦N) 文字目が gのときは i ターン目でTopCoDeerくんがグーを出すことを、 pのときはパーを出すことを表します。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            String s = sc.next();
            int n = String.valueOf(s).length();
            int count = 0;
            
            for(int i=0; i<n; i++){
            	if(s.substring(i,i+1).equals("p")){
            		count++;
            	}
            }
            
            System.out.println(n/2 - count);
            sc.close();
		}
    }
	