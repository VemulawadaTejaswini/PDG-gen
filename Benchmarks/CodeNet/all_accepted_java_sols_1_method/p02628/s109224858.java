import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int frs[] = new int[n];
      	int prs = 0;
      	
      	for(int i = 0;i < n;i++) frs[i] = sc.nextInt();
      	Arrays.sort(frs);
      	for(int i = 0;i < k;i++) prs += frs[i];
      
      	System.out.println(prs);
        
	}
}
