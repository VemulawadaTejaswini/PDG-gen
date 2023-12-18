import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
         
        Scanner sc = new Scanner(System.in);
        
        	String W = sc.next();
            String T;
        	int count = 0;
        
        while(true){
            
            T = sc.next();
            
            if(T.equals("END_OF_TEXT")) break;

            for(int i=0;i<T.length();i++){
                
          	  if( Character.isUpperCase( T.charAt( i ) ) ) {	
                
          		  Character.toLowerCase( T.charAt( i ));
                  
            	}else{
              }
             
            }
            if (T.equals(W)) {
                        count++;
                }
        }
                        System.out.println(count);
        sc.close();
    }
}
