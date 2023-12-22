//参考元：tomerun 氏のコード(2019-10-27 21:03:32)
//https://atcoder.jp/contests/abc144/submissions/8150492

import java.util.*;

public class Main{
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     long num1 = scan.nextLong();
     long ans = Long.MAX_VALUE;
     
     // 本来はnum1個の約数について調べなければならないが、
     // 約数の対称性により a < bのとき Nの平方根個分調べるだけで済む
	 for (long i = 1; i * i <= num1; i++) {
          if (num1 % i == 0) {
              ans = Math.min(ans, i + num1 / i - 2);
          }
      }
     
     System.out.println(ans);
     

   }
}