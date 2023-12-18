import java.util.*;
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
      long a = sc.nextInt();
      long b = sc.nextInt();
      long c = sc.nextInt();
      long d = sc.nextInt();
      //int x = 0;
      //int y = 0;

      //ansが負になることを考えて、想定される最低値を設定
      //int型の最大値を超えるためlongを使用※末尾にLをつける
      long calc = 0;
      long ans = -1000000000000000000L; 


    //パターン１、全てのXとYのパターンを試して最大値を比較して更新する
    /*  for (int x = a; x <= b; x++) {
        for (int y = c; y <= d; y++) {
            calc = x*y;
            if(calc>=ans){
                ans = calc;
            }
        }
      }
      */
    
      //パターン２、プラス同士やマイナス同士を優先するやり方
      //絶対値取得 Math.abs(i);
    if(a>=0){
        if(c>=0){
        //全て正の範囲同士
        ans = b*d;
        }else if(c<0){
            if(d>=0){
            //xが正、yが正負あり得る
            ans = b*d;
            }else if(d<0){
            //xが正、yが負
            ans = a*d;     
            }         
        }
    }else if(a<0){
        if(b>=0){
            //xが正負あり得る、bが最大
            if(c>=0){
                //xが正負ありえる、yが正
                ans = b*d;
            }else if(c<0){
                if(d>=0){
                    //xが正負ありえる、yが正負あり得る
                    ans = a*c;
                    calc = b*d;
                    if(ans<calc){
                        ans = calc;
                    }
                }else if(d<0){
                //xが正負ありえる、yが負
                    ans = a*c;     
                }         
            }
        }else if(b<0){
            if(c>=0){
            //xが負、yが正
            ans = b*c;
            }else if(c<0){
                if(d>=0){
                //xが負、yが正負あり得る
                ans = a*c;
                }else if(d<0){
                //xが負、yが負
                ans = a*c;     
                }         
            }
        }
    }
    
      System.out.println(ans);   
  }
}