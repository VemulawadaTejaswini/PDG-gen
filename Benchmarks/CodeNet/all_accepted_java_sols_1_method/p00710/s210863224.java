import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String args[]){
		
		int n,r,p,c;
		int[] before,after;
		Scanner in = new Scanner(System.in);
		
		while(true){
			n = Integer.parseInt(in.next());
			r = Integer.parseInt(in.next());
			
			if(n==0 && r==0)break;
			
			before = new int[n];
			after = new int[n];
			
			for(int i=0;i<n;i++){
				before[i] = n-i;
			}
			
			for(int i=0;i<r;i++){
				p = Integer.parseInt(in.next())-1;
				c = Integer.parseInt(in.next());
				
				for(int j=0;j<n;j++){
					if(j < c ){
						after[j] = before[p+j];
					} else if( j < p+c ){
						after[j] = before[j-c];
					} else{
						after[j] = before[j];
					}
				}
				
				before = after;
				after = new int[n];
			}
			
			System.out.println(before[0]+"");
		}
		
		in.close();
	}
}