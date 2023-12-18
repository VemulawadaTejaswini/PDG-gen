import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);   
    //金額
    int x = sc.nextInt();
    //購入できる数
    int num = x/100;
    //端数
    int a = x - num*100;
    //num=2の時200～210円の中で買える
    //端数が購入できる数*5以内の時、可とする
    if(num*5>=a ){
        System.out.println(1);
      }else{
        System.out.println(0);
      }
  }
}