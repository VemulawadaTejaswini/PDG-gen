//8-A
import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	
    	Scanner sc = new Scanner(System.in);

        String n = sc.next();
        
        int num = n.length();
        
        for( int i = 0 ; i < num ; i++ ){
        	
        	if(Character.isLowerCase(n.charAt(i))){
        		
                System.out.print(Character.toUpperCase(n.charAt(i)));
                
            }else if(Character.isUpperCase(n.charAt(i))){
            	
                System.out.print(Character.toLowerCase(n.charAt(i)));
                
            }else {
            	
                System.out.print(n.charAt(i));
                
            }
        	
        }
        
        
    }
}