import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long o=0;
        long x=sc.nextLong();
        long y=sc.nextLong();
      	long z=sc.nextLong();
        long a=sc.nextLong();
      	if(a>x){
        	o+=x;  
          	a-=x;
          	a-=y;
          if(a>0){
          	o-=a;
          }
        }else{
          o=a;
        	      	
        }
        
      System.out.println(o);
    }
}  