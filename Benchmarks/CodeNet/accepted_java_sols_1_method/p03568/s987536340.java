import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	long odd = 1;
      	long ans;
      	
      	for(int i = 0;i < n;i++){
        	if(sc.nextInt()%2==0) odd *= 2;
        }
      	
      	ans = (long)Math.pow(3,n) - odd;
      
        System.out.println(ans);
             	
        
	}
}
