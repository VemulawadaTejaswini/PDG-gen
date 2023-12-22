//私たちはN人で旅行しようとしており、その交通手段として電車とタクシーがあります。
//電車を使うと1人あたりA円かかります。
//タクシーを使うとN人でB円かかります。
//全員の交通費の合計は最小でいくらになるでしょうか。

import java.util.*;

  public class Main{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      while(sc.hasNext()){
      int N=sc.nextInt(); //人数
      int A=sc.nextInt(); //電車を使った時の値段
      int B=sc.nextInt(); //タクシーを使った時の値段
      if(N*A>B){
        System.out.println(B);
      }else{
        System.out.println(N*A);
      }
    }
  }
}
