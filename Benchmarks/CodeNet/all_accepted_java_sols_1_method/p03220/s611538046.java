import java.util.Scanner;

public class Main{
		
	public static void main(String args[]){
		  
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int T = sc.nextInt();
	    int A = sc.nextInt();
	    
	    int h;
	    double min = 114514;
	    int ans = 0;
	    for(int i = 1; i <= N; i++) {
	    	h = sc.nextInt();
	    	
	    	double tmp = T-h*0.006;
	    	double dis = Math.abs(A-tmp);
	    	
	    	if(min > dis) {
	    		min = dis;
	    		ans = i;
	    	}
	    }
	    
	    System.out.println(ans);
	    
	    
	}
	
}