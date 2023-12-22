import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    int x=sc.nextInt();int y=sc.nextInt();
    String c=sc.next();
    if(c.equals(a))x--;
    else y--;
    System.out.print(x+" "+y);
  }
}
