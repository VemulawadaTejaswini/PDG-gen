import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      	long x = Long.parseLong(sc.next());
      	long k = Long.parseLong(sc.next());
      	long d = Long.parseLong(sc.next());
        
 
      if(x == d){
        System.out.println(d);
      }else{
        if(x>0){
      		while(x>0){
         		 x= x -d;
            }
          	x= x+d;
        }else{
             while(x<=0){
         		 x= x + d;
            }
          	x= x-d;      
          
       } 
          System.out.println(Math.abs(x));
      }
   
      }
}

