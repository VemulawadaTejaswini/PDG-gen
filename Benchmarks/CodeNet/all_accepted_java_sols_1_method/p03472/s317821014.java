/*
 * あなたが散歩していると、突然一体の魔物が出現しました。幸い、あなたは N 本の刀、刀 1、刀 2、…、刀 N を持っていて、次の二種類の攻撃を自由な順番で行うことができます。
 * 
 *     持っている刀のうち一本を振る。刀 i (1≤i≤N) を振ると、魔物は ai ポイントのダメージを受ける。同じ刀を何度振ることもできる。
 *     持っている刀のうち一本を投げつける。刀 i (1≤i≤N) を投げつけると、魔物は bi ポイントのダメージを受け、あなたはその刀を失う。すなわち、あなたは以後その刀を振ることも投げつけることもできなくなる。
 * 
 * 魔物は、受けたダメージの合計が H ポイント以上になると消滅します。魔物を消滅させるには、最小で合計何回の攻撃が必要でしょうか。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int h = Integer.parseInt(sc.next());
            int maxSlash = 0;
            Integer[] damageThrow = new Integer[n];
            int count = 0;
            int a = 0;
            int b = 0;
            
            for(int i=0; i<n; i++){
            	a = Integer.parseInt(sc.next());
                b = Integer.parseInt(sc.next());
                
                if(a>maxSlash){
                	maxSlash = a;
                }
                damageThrow[i] = b;
            }
            Arrays.sort(damageThrow);
            
            while(h>0){
            	if(count < n && maxSlash < damageThrow[n-count-1]){
            		h -= damageThrow[n-count-1];
            		count++;
            	}else{
            		count += (int)Math.ceil(h*1.0/maxSlash);
            		h = 0;
            	}
            }
            
            //出力
            System.out.println(count);
            sc.close();
        }
    }
	