import java.util.*;
public class Main{
  
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();
    int tobeFilled = A-B>0?A-B:0;
    int remaining = C>tobeFilled?C-tobeFilled:0;
    System.out.println(remaining);
    
  }
  
}