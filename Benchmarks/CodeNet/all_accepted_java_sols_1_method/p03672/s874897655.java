import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    sc.close();
	    
	    if (S.length()%2==0){
	    	S = S.substring(0,S.length()-2);
	    	while (S.length()!=0){
	    		String first = S.substring(0, S.length()/2);
	    		String second = S.substring(S.length()/2,S.length());
	    		
	    		if (first.toString().equals(second.toString())==false){
	    			S = S.substring(0,S.length()-2);	
	    		}
	    		else
	    			break;
	    	}
	    }
	    else {
	    	S = S.substring(0,S.length()-1);	
	    	while (S.length()!=1){
	    		String first = S.substring(0, S.length()/2);
	    		String second = S.substring(S.length()/2,S.length());
	    		
	    		if (first.toString().equals(second.toString())==false){
	    			S = S.substring(0,S.length()-2);	
	    		}
	    		else
	    			break;
	    	}
	    }
	    if (S.length()==1)
	    	System.out.println(0);
	    else 
	    	System.out.println(S.length());

	}

}
