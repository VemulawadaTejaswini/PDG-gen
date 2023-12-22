import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String A = sc.next();
    int start = Integer.parseInt(A);
    String B = sc.next();
    int end = Integer.parseInt(B);
    int count = 0;
    
    for(int i = start; i <= end; i++){
      String judge = Integer.toString(i);
      if(judge.charAt(0) == judge.charAt(4) && judge.charAt(1) == judge.charAt(3)){
        count++;
      }
    }
    
    System.out.println(count);
  }
}

      