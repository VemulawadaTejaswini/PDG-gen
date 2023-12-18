import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      
      //入力
      long X = sc.nextLong();//目標額
      long money = 100;
      long year =0; 
      
      //預金額が目標額以上になるまで
      while(money<X){
       money *= 1.01;
       year =year+1;
      }
      System.out.println(year);
    }
}