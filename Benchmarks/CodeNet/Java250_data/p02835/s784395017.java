import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=0;
    a=a+sc.nextInt();
    a=a+sc.nextInt();
    a=a+sc.nextInt();
    if(a>21){
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  }
  

  
}