import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   	
    String wa = sc.next();
        
   if(wa.equals("Sunny")){
       System.out.println("Cloudy");
   }else if(wa.equals("Cloudy")){
   		System.out.println("Rainy");
   }else if(wa.equals("Rainy")){
   		System.out.println("Sunny");
   }
    }
}