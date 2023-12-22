import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%1000 == 0)
      System.out.println(0);
    else
      System.out.println(1000-num%1000);
  }
}