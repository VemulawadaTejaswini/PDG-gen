import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();
    
    char[] RB = S.toCharArray();
    int redCount = 0;
    int blueCount = 0;
    for(int i = 0 ; i < N ; i++){
      char rb = RB[i];
      if(rb == 'R'){
        redCount++;
      }else{
        blueCount++;
      }
    }
    
    if(redCount > blueCount){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }  
}