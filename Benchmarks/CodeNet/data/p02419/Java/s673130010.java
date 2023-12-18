import java.util.Scanner;
class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String W;
    	String T;
    	String change_W;
    	String change_T;
    	String end = "END_OF_TEXT";
    	int count = 0;
    	
    	
    	W = scan.nextLine();
    	change_W = W.toLowerCase();
    	
    	for(;;){
        	T = scan.nextLine();
    		if(T.equals(end)) break;
    		
    		change_T = T.toLowerCase();
    		
    		if(change_W.indexOf(change_T) == -1){
    			count++;
    		}
    	}
    	
    	 System.out.println(count);
     }
}