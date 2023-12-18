import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m=sc.nextInt();
    sc.next();
    if(sc.nextInt()>m)
      System.out.println(1);
    else
      System.out.println(0);
  }
}