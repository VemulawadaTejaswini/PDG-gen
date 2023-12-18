import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    if(a <= 999 && a >= 100){
    System.out.println("ABC" + a);
    }else{
    System.out.println("ABCの回数が違反しています");
    }
  }
}