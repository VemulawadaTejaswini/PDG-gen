/*
 * 縦横に無限に広がるマス目があり、そのうちの連続する N 行 M 列の領域のすべてのマスに表裏の区別できるカードが置かれています。 最初はすべてのカードが表を向いています。
 * 
 * 以下の操作を、カードが置かれている全てのマスについて 1 度ずつ行います。
 * 
 *     そのマスと辺または点で接する 8 つのマスと、そのマスの合計 9 マスについて、カードが存在するなら裏返す。
 * 
 * すべての操作を行った後の各カードの状態は操作を行う順番に依らないことが証明できます。 すべての操作を行った後、裏を向いているカードの枚数を求めてください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            long n = Integer.parseInt(sc.next());
            long m = Integer.parseInt(sc.next());
            long ret = 0;
            
            // 
            if(n>1 && m>1){
            	// どの辺も長さが2以上なら内側の部分が裏になる
            	ret = (n-2) * (m-2);
            }else if(n==1 && m==1){
            	// 1マスのときはそれは裏になる
            	ret = 1;
            }else{
            	// マス1列のときは両端以外が裏になる
            	ret = Math.max(n, m) - 2;
            }
            
            //出力
            System.out.println(ret);
            sc.close();
        }
    }
	