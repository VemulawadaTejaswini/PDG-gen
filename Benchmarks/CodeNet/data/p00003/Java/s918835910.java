import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int n = scn.nextInt();
    	
    	for(int i=0; i<n; i++){
    		int a,b,c;
    		a = scn.nextInt();
    		b = scn.nextInt();
    		c = scn.nextInt();
    		
    		if(Math.abs(a*a-b*b) == c*c || a*a+b*b == c*c){
    			System.out.println("YES");
    		}else{
    			System.out.println("NO");
    		}
    	}
    }
}