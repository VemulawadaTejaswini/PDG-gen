/*
 * N 個の整数 a1,a2,..,aN が与えられます。えび君はこれらを書き換えて全て同じ整数にしようとしています。各ai(1≦i≦N)は高々一回しか書き換えられません(書き換えなくても良い)。
 * 整数xを整数yに書き換えるとき、コストが(x−y)^2かかります。仮にai=aj(i≠j)だとしても、ひとつ分のコストで同時に書き換えることは出来ません。
 * えび君が目的を達成するのに必要なコストの総和の最小値を求めてください。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int n = Integer.parseInt(sc.next());
            int[] nums = new int[n];
            int sum = 0;

            for(int i=0; i<n; i++){
            	nums[i] = Integer.parseInt(sc.next());
            	sum += nums[i];
            }
            
            long goal = Math.round((sum*1.0)/n);
            long ret = 0;
            
            for(int i=0; i<n; i++){
            	ret += (goal - nums[i]) * (goal - nums[i]);
            }
            
            // 出力
            System.out.println(ret);

            sc.close();
        }
    }
	