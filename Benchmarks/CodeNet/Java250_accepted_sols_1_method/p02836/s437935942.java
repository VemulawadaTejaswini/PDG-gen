import java.util.*;
 
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int hugTime = 0;
    
    int sL = s.length();
    
    for ( int i = 0; i < sL/2; i++){
      char c1 = s.charAt(i);
      char c2 = s.charAt(sL-1-i);
      if(!(c1 == c2)){
        hugTime++;
      }
    }
    
    System.out.println(hugTime);
    
  }
}