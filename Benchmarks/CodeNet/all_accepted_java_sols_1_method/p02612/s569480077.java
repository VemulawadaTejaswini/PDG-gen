import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int money=scan.nextInt();
    if(money%1000!=0){
      System.out.println(1000-money%1000);
    }else{
      System.out.println(0);
    }
  }
}