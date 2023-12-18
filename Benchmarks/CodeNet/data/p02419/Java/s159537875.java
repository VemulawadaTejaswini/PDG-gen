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
        	
        	if( num != -1 ){
        		count++;
        	}
        	
        	//???????????¨?????§????????£????????? str ?????\???
        	String[] str = T.split(" ");
        	
        	for(int i=0; i<str.length; i++){
        		//?????????????£?????????? equalsIgnoreCase(W) ??§
        		//????????????boolean
        		if(str[i].equalsIgnoreCase(W)){
        			count++;
        		}
        	}
        	
        }
        
         System.out.println(count);
        
    }
}