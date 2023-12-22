import java.util.*;
import java.util.Arrays;

public class Main{
  
  public static void main(String[] args) throws Exception{
    
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    
    if(N>=2 && N<=100 && x>=1){
    int[] list = new int[N];
    
    for(int i = 0 ; i < N ; i++){
      list[i] = Integer.parseInt(sc.next());
      if(list[i] == 0){
        throw new Exception("入力条件に違反しています");
      }
    }
    Arrays.sort(list);
   
    int count = 0;
    for(int i = 0 ; i < N && x > 0; i++){
      x -= list[i];
      if(x >= 0){
        count++;
      }
    }
    
    if(count == N && x > 0){
       count -= 1;
       System.out.println(count);  
    }else{
      System.out.println(count);
    }
    }else{
      System.out.println("入力条件に違反しています");
    }
  }  
}