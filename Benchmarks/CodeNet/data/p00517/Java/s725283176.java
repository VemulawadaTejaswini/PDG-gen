import java.util.*;
     
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int W = sc.nextInt();
    	int H = sc.nextInt();
    	int N = sc.nextInt();
    	int now_x = sc.nextInt();
    	int now_y = sc.nextInt();
    	
    	int min = 0;
    	
    	for(int i = 0;i < N - 1;i++){
    		int por_x = sc.nextInt();
    		int por_y = sc.nextInt();
    		
    		int x = por_x - now_x;
    		int y = por_y - now_y;
    		
    		if(x == y){
    			min += Math.abs(x);
    		}
    		
    		if(x > 0 && y <= 0){
    			y = -y;
    			min += (x + y);
    		}
    		
    		if(x <= 0 && y >= 0){
    			x = -x;
    			min += (x + y);
    		}
    		
    		if(x <= 0 && y <= 0){
    			x = -x;
    			y = -y;
    			min += Math.max(x, y);
    		}
    		
    		now_x = por_x;
    		now_y = por_y;
    	}
    	
    	System.out.println(min);
    }
}