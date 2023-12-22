import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int hs[] = new int[n];
      	long sum = 0;
      
      	for(int i = 0;i < n;i++) hs[i] = sc.nextInt();        
        Arrays.sort(hs);
      	
      	for(int i = 0;i < n-k;i++) sum += hs[i];     	
      	
      	System.out.println(sum);
        
	}
}
