import java.util.*;
import java.lang.*;
  
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int t=stdIn.nextInt();
    int h,m,s;
    s=t%60;
    t=t/60;
    m=t%60;
    t=t/60;
    h=t;
    System.out.println(h+":"+m+":"+s);
  }
}
