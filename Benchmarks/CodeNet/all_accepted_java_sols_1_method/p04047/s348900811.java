/*
 * 高橋君はバーベキューをしようとしています。 バーベキューでは 2 本の串にいくつかの具材を刺した串焼きを N 個作る予定です。
 * 
 * 串は 2N 本あり、i 番目の串の長さは Li です。具材は無限に用意されています。
 * 
 * 串を 2 本組にして具材を刺して串焼きにするのですが、2 本の串のうち短い方の長さを x とすると、串焼きには最大 x 個の具材を刺すことができます。
 * 
 * うまく串を組み合わせたとき、N 個の串焼きに刺すことのできる具材の個数の和の最大値はいくらになるでしょうか？
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int[] sticks = new int[2*n];
            int ret = 0;
            
            for(int i=0; i<2*n; i++){
            	sticks[i] = Integer.parseInt(sc.next());
            }
            
            Arrays.sort(sticks);
            
            for(int i=0; i<n; i++){
            	ret += sticks[2*i];
            }
            
            //出力
            System.out.println(ret);
            sc.close();
        }
    }
	