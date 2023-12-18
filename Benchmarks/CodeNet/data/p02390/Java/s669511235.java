import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int h,m,s;

    h = a / 3600;
    a %= 3600;

    m = a / 60;
    a %= 60;

    s = a;

    System.out.println(h + ":" + m + ":" + s);   

       
   
  }

}