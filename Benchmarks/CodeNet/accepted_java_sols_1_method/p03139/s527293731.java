import java.util.*;
public class Main{
  public static void main(String [] args){
   Scanner i = new Scanner(System.in);
    int t = i.nextInt();
    int x = i.nextInt();
    int y = i.nextInt();
    System.out.println(Math.min(x,y) + " " + (x+y>t ? x+y-t : 0));
  }
  
  
}