import java.util.*;
 
public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    
    if(num>=2 && num<=(long)Math.pow(10,5)){
    long ans = 1;
    for(long i = 0; i < num; ++i){
      long a = sc.nextLong();
      if(a != 0){
       ans = ans * a;
      }else{
        ans = 0;
        break;
      }
    }
    
    if(ans <= (long)Math.pow(10,18)){
      System.out.println(ans);
    }else{
      System.out.println(-1);
    }
    }else{
      System.out.println("入力条件に違反しています");
    }
  }  
}