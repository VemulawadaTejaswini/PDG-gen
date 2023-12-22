import java.util.*;
public class Main{
  public static void main(String[] args) {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a+b+c>=22){
      System.out.println("bust");
    }
    if(a+b+c<=21){
      System.out.println("win");
    }
  }
}
