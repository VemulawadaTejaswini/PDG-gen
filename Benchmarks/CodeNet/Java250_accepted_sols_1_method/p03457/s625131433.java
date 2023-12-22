/* 
 * シカのAtCoDeerくんは二次元平面上で旅行をしようとしています。 AtCoDeerくんの旅行プランでは、時刻 0 に 点 (0,0) を出発し、 1 以上 N 以下の各 i に対し、時刻 ti に 点 (xi,yi) を訪れる予定です。
 * 
 * AtCoDeerくんが時刻 t に 点 (x,y) にいる時、 時刻 t+1 には 点 (x+1,y), (x−1,y), (x,y+1), (x,y−1) のうちいずれかに存在することができます。 その場にとどまることは出来ないことに注意してください。
 * AtCoDeerくんの旅行プランが実行可能かどうか判定してください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            
            int t = 0;
            int ti = 0;
            int x = 0;
            int xi = 0;
            int y = 0;
            int yi = 0;
            // 連続する二点間の距離d
            int d = 0;
            
            // 各連続する二点間について考える
            for(int i=0; i<n; i++){
            	ti = Integer.parseInt(sc.next());
            	xi = Integer.parseInt(sc.next());
            	yi = Integer.parseInt(sc.next());
            	
            	d = (int)(Math.abs(xi-x) + Math.abs(yi-y));
            	
            	// dが時間より長い、またdと時間の差が奇数(ちょうど目的地に着けない)ならばNoを出力してreturn
            	if(ti-t < d || (d-ti+t)%2 != 0){
            		System.out.println("No");
                    sc.close();
                    return;
            	}
            	t = ti;
            	x = xi;
            	y = yi;
            }
            
            // どの二点間も旅行可能ならばYesを出力
            System.out.println("Yes");
            sc.close();
        }
    }
	