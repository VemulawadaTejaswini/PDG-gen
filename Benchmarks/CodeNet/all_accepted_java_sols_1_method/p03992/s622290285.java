import java.util.*;
 
public class Main{
  
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    String in = sc.next();
    String ret = in.substring(0,4) + " " + in.substring(4);
    System.out.println(ret);
    }
 
}