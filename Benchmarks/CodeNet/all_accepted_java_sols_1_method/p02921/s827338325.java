import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    String T = sc.next();
    
    String oneS = S.substring(0,1);
    String twoS = S.substring(1,2);
    String threeS = S.substring(2,3);
    
    String oneT = T.substring(0,1);
    String twoT = T.substring(1,2);
    String threeT = T.substring(2,3);
    
    int count = 0;
    if (oneS.equals(oneT)) {
      count ++;
    }
    if (twoS.equals(twoT)) {
      count ++;
    }
    if (threeS.equals(threeT)) {
      count ++;
    }
    
    System.out.println(count);
  }
}