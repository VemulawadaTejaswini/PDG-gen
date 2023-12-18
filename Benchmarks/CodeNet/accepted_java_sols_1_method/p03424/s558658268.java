import java.util.*;

public class Main{
  
  public static void main (String[] args){
  
  	Scanner scanner = new Scanner (System.in);
  
   	int N = scanner.nextInt();
    
    boolean flag = false;
    
    for (int i=0; i<N; i++){
      String a = scanner.next();
      if (a.equals("Y")){
        flag = true;
      }
    }
    if (flag == true){
      System.out.println("Four");
    } else {
      System.out.println("Three");
    }
  }
}