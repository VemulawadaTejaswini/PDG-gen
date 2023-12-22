import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==-1)break;
			double r = 1;
			double d = 0;
			
			for(int i=0;i<n-1;i++){
				d += Math.atan(1/r);
				r = Math.sqrt(1+r*r);
			}
				
			System.out.println(r*Math.cos(d));
			System.out.println(r*Math.sin(d));
		}
	
	}	
}