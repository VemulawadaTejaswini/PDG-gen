import java.util.*;
import java.util.Arrays;
public class Main{
    
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a =  sc.nextInt();
       int b =  sc.nextInt();
       int h =  sc.nextInt();
       int m=  sc.nextInt();
       double pi = 3.14159265359;
       int time = h*60+m;
       double w = (double)(time%360*0.5);
       double len = Math.sqrt(a*a+b*b-2*a*b*(Math.cos(w)));
       System.out.println(len);

       
    }
   
    
       
    
}