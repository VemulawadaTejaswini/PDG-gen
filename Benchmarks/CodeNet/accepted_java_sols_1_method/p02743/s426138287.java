import java.util.*;

class Main{

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
      	
      	long num = c - a -b ;
      	if (num < 0){
            System.out.println("No");    	        
        
        }
      else{
      	if( (4*a*b) < num*num){
	        System.out.println("Yes");    	
        }
      	else{
	        System.out.println("No");    	        
        }
      }

    }
}

