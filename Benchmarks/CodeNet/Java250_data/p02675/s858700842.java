import java.util.*;
import java.util.Arrays;
public class Main{
    
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n =  sc.nextInt();
       int r=10;
       while(r>0){
           r = n/10;
           n = n-10*r;
           
       }
       if(n==3){
           System.out.println("bon");
       }
       else if(n==0 || n==1 || n== 6|| n==8){
           System.out.println("pon");
       }
       else{
        System.out.println("hon");
       }
    }
   
    
       
    
}