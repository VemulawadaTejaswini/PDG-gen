import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    if(a+b>=a*b && a+b>=a-b){
      System.out.println(a+b);
    }else if(a-b>=a+b && a-b>=a*b){
      System.out.println(a-b);
    }else if(a*b>=a+b && a*b>=a-b){
      System.out.println(a*b);
    }
  }
}