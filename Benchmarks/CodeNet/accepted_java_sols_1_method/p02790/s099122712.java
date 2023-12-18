import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      int b = sc.nextInt();
      String c = "";
		
	    
	        if(a >= b) {
              for(int i=0;i<a;i++){
                c+=String.valueOf(b);
              }
	        	
	        } else {
              for(int i=0;i<b;i++){
                c+=String.valueOf(a);
              }
              
            }
      System.out.println(c);
	  
 
 
 
		sc.close();
	}
}