import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int atai = -1;
		
		int[] c = new int[1001];
		int[] d = new int[1001];
		
		for(int i=1; i<=1000; i++){
			c[i] = (int)(i*0.08);
			
			if(c[i]==A){
				for(int j=1; j<=1000; j++){
					d[j] = (int)(j*0.10);
					
					if(d[j] == B){
						if(i==j){
							atai = i; 
							System.out.println(atai);
							System.exit(0);
							
						}
					}
				}
			}
		}
	
		System.out.println(atai);
	}
}