import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String[] s = sc.next().split("");
    
    int clear = 0;
    int gclear = 0;
    
    for(int i = 0;i < n;i++){
      if(s[i].equals("a") && clear < a+b){
        System.out.println("Yes");
        clear++;
      }else if(s[i].equals("b") && clear < a+b & ++gclear <= b){
        System.out.println("Yes");
        clear++;
      }else{
        System.out.println("No");
      }
      
      
    }
    
    
    
  }
}