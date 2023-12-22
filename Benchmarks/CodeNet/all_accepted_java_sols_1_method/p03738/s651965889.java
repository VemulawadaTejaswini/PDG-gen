import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String A = sc.next();
	String B = sc.next();
	if(A.equals(B)){
		System.out.println("EQUAL");
	}else if(A.length() > B.length()){
		System.out.println("GREATER");		
	}else if(A.length() < B.length()){
		System.out.println("LESS");
	}else if(A.length() == B.length()){
		int a = Integer.parseInt(A.substring(0, 1));
		int b = Integer.parseInt(B.substring(0, 1));
		if(a > b){
			System.out.println("GREATER");					
		}else{
			System.out.println("LESS");			
		}
	}
	
	}	
}	
	

