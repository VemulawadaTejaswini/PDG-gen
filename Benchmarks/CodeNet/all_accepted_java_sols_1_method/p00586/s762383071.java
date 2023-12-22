import java.util.*;

public class Main {                       
 
  public static void main(String[] args) {                     
      Scanner sc = new Scanner(System.in);
      
      ArrayList<Integer> ans = new ArrayList<Integer>();
      
      while(sc.hasNext()){
          int a = sc.nextInt();
          int b = sc.nextInt();
          ans.add(a+b);       
      }
     
      for(int i = 0;i < ans.size();i++){
          System.out.println(ans.get(i));
      }
    
  }  
      
}

        