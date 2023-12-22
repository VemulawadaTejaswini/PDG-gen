import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	long as[] = new long[n];
      	int stack;
		boolean neq = true;
      
      	for(int i = 0;i < n;i++){
        	as[i] = sc.nextInt(); 
        } 
      	Arrays.sort(as);
      	for(int i = 0;i < n-1 && neq;i++){
        	if(as[i] == as[i+1]) neq = false; 
        } 
       	
      	if(neq) System.out.println("YES");
      	else System.out.println("NO");
        
	}
}
