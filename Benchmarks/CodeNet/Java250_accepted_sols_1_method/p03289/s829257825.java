import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        int komoji = 0;
        if(!(Character.isUpperCase(s.charAt(1)))){
        	komoji++;
            if(!(Character.isUpperCase(s.charAt(s.length() - 1)))){
            	komoji++;
            }
        }
        for(int i = 2; i < s.length() - 1; i++){
        	if(s.charAt(i) == 'C'){
            	count++;
            }else if(!(Character.isUpperCase(s.charAt(i)))){
            	komoji++;
            }
        }
        if(s.charAt(0) == 'A' && count == 1 && komoji == s.length() - 2){
        	System.out.println("AC");
        }else{
        	System.out.println("WA");
        }
    }
}