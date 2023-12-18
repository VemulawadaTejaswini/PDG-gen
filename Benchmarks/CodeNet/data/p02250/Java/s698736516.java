import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String str =sc.next();
    	int n=sc.nextInt();
    	String pi;
    	for(int i=0;i<n;i++){
    		pi=sc.next();
    			str=str.concat("..");

    		for(int j=0;j<str.length()-pi.length();j++){
    			if(str.substring(j, j+pi.length()).equals(pi)){
    				System.out.println(1);
    				break;
    			}else if(j==str.length()-pi.length()-1){
    				System.out.println(0);
    			}
    			
    		}
    	}
    	
    	
    }
}
