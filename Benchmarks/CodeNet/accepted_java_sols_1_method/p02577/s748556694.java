import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
        long soukei = 0;

		for(int i = 0 ; i <=n.length()-1 ; i++){
        	soukei = soukei + Character.getNumericValue(n.charAt(i));    	
        }
		
      	if(soukei%9 == 0){
      		System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}