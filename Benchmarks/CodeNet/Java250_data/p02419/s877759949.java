import java.util.Scanner;
class Main{
     public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String W;
    	String T;
    	String change_W = "";
    	String change_T = "" ;
    	String end = "END_OF_TEXT";
    	int count = 0;
    	
    	W = scan.nextLine();
    	change_W = W.toLowerCase();
    	
    	for(;;){
        	T = scan.nextLine();
    		if(T.equals(end)) break;  		
    		change_T = T.toLowerCase();
    		String sepa[] = change_T.split(" ");
    		
    		for(int i = 0; i < sepa.length; i++){
    			if(change_W.equals(sepa[i])){
    				count++;
    			}
    		}
    		
    	}
    	
    	 System.out.println(count);
     }
}