import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      int a=sc.nextInt(); //秒
      int b=sc.nextInt(); //枚数
      int t=sc.nextInt();
      int total;
      total=(int)(t+0.5)/a;
      System.out.println(total*b);
    }
  }
}