import java.util.*;
import java.util.Arrays;
public class Main{
    
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int k =  sc.nextInt();
       String s = sc.next();
       char [] ss = s.toCharArray();
       int len = 0;
       
       if(ss.length<= k){
           System.out.println(s);
       }
       else{
           for(int i=0;i<k;i++){
               System.out.print(ss[i]);
           }
           System.out.println("...");

       }
    }
   
    
       
    
}