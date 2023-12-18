import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		if(a.charAt(0) == 'H'){   
		    if(b.charAt(0) == 'H'){
		        System.out.println('H');
		    }
		    else{
		        System.out.println('D');
		    }
		}
		else{
		    if(b.charAt(0) == 'H'){
		        System.out.println('D');
		    }
		    else{
		        System.out.println('H');
		    }
		}
	}
 
}