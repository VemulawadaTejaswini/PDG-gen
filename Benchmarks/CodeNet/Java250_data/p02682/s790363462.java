import java.io.*;
import java.util.*;
class Main {
  public static int result = 0;
  public static int a = 0;
  public static int b = 0;
  public static int c = 0;
  public static int k = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); //1のカード枚数
        b = sc.nextInt(); //0のカード枚数
        c = sc.nextInt(); //-1のカード枚数
        k = sc.nextInt(); //引くカードの枚数
        k = calc(a,k, 1);
        k = calc(b,k, 0);
        k = calc(c,k, -1);
        System.out.println(result);
    }
    public static int calc(int num, int k , int card){
      if(k==0) return k;
      if(num >= k){
        result += k*card;
        k=0;
      }else {
        result += num*card;
        k-=num;
      }
      return k;
    }
}
