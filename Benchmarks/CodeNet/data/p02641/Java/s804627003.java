import java.util.*;
import java.util.Arrays;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < n; i++){
         list.add(sc.nextInt());
    }
    
    if(n == 0){
      System.out.println(x);
      return;
    }else if(!list.contains(x)){
      System.out.println(x);
      return;
    }else{
 
      int i = 1;
      while(true){
        int a = x-i;
        int b = x+i;
        if(!list.contains(a)){
          System.out.println(a);
          return;
        }else if(!list.contains(b)){
          System.out.println(b);
          return;
        }else{
          i++;
        } 
      }
      
    }
    
  }
}