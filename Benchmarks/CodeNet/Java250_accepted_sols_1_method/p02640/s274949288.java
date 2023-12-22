import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = 0;
      int b = 0;
      int ss = 0;
      for(a=0;a<=100;a++){
        for(b=0;b<=100;b++){
          if(a+b==x && 2*a+4*b==y){
            ss = 1;
          }
        }
      }
      if(ss==1){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      
     
    }
   
    
       
    
}