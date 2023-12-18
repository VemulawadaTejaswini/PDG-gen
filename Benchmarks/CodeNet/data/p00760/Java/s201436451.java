import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new A().doIt();
    }
    class A{
    	int n3Y[] = {0,20,19,20,19,20,19,20,19,20,19}; 
    	int cntDay(int Y,int M,int D){
    		int result = 0;
    		for(int i = 1;i < Y;i++){
    			if(i % 3 == 0)result = result + 200;
    			else result = result + 195;
    		}
    		if(Y % 3 != 0){
    			for(int i = 1;i < M;i++)result = result + n3Y[i];
    		}else{
    			result = result + (20 * (M-1)); 
    		}
    		result = result + D;
    		return result;
    	}
    	void doIt(){
    		int n = sc.nextInt();
    		for(int i = 0;i < n;i++){
    			int Y = sc.nextInt(),M = sc.nextInt(),D = sc.nextInt();
    			int max = cntDay(1000,1,1);
    			int day = cntDay(Y,M,D);
        		System.out.println(max-day);
    		}
    	}
    }
}