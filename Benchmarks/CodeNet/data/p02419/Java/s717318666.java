//9-A
 
import java.util.Scanner;
 
class Main {
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
         
        String W = sc.next();//??????
        
        int count = 0;
        
        while(true){
        	
        	String T = sc.next();//??????
        	
        	if(T.equals("END_OF_TEXT")){
        		break;
        	}
        	
        	int num = T.indexOf(W);
        	
        	if( num != 0 ){
        		count++;
        	}
        	
        	
        }
        
         System.out.println(count);
        
    }
}