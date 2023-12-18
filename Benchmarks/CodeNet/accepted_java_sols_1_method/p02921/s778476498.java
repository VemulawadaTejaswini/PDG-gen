import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String T = scan.next();
    
    char[] forcast = S.toCharArray();
    char[] real    = T.toCharArray();
    
    int count=0;
    for (int i=0;i<3;i++) {
      if(forcast[i] == real[i]) count++;
    }
    System.out.println(count);
  
  }
 
}