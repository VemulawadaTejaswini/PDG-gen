import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	new aoj0082().doIt();
    }
    class aoj0082{
    	void doIt(){
    		int check[] = {1,4,1,4,1,2,1,2};
    		while(true){
    			int a[] = new int [8];
    			int ans[] = new int [8];
    			for(int i = 0;i < 8;i++)a[i] = sc.nextInt();
    			int min = Integer.MAX_VALUE;
    			for(int i = 0;i < 8;i++){
    				int num = 0;
    				for(int j = 0;j < 8;j++){
    					if(a[(i+j)%8] - check[j] > 0)num += a[(i+j)%8] - check[j];
    				}
    				if(min > num){
    					min = num;
    					for(int j = 0;j < 8;j++){
    						ans[(i+j)%8] = check[j];
    					}
    				}
    			}
    			for(int i = 0;i < 7;i++)System.out.print(ans[i]+" ");
    			System.out.println(ans[7]);
    		}
    	}
    }
}