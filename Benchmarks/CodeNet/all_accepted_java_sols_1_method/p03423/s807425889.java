/*
 * ある学校には、N 人の生徒がいます。
 * 
 * 生徒たちをいくつかのグループに分け、グループごとにあるテーマについて話し合ってもらうこととなりました。
 * 
 * あなたは、2 人以下のグループだと効果的な話し合いが出来ないと考えており、なるだけ多くのグループを 3 人以上にしたいです。
 * 
 * 生徒たちを上手く分けて、3 人以上のグループの数を最大化してください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int n = Integer.parseInt(sc.next());
            // 出力
            System.out.println(n/3);
            sc.close();
        }
    }
