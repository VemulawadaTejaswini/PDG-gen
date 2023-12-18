
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2015().doIt();
    }
    class aoj2015{
    	void doIt(){
    		while(true){
    			int h = sc.nextInt();
    			int w = sc.nextInt();
    			if(h+w == 0)break;
    			int map_h[] = new int [h];
    			int map_w[] = new int [w];
    			int hh[] = new int[1500001];
    			int ww[] = new int[1500001];
    			for(int i = 0;i < h;i++)map_h[i] = sc.nextInt();
    			for(int i = 0;i < w;i++)map_w[i] = sc.nextInt();
    			int max = 0;
    			for(int i = 0;i < h;i++){
    				int sum = 0;
    				for(int j = i;j >= 0;j--){
    					sum = sum + map_h[j];
    					hh[sum]++;
    				}
    				max = Math.max(max, sum);
    			}
    			for(int i = 0;i < w;i++){
    				int sum = 0;
    				for(int j = i;j >= 0;j--){
    					sum = sum + map_w[j];
    					ww[sum]++;
    				}
    				max = Math.max(max, sum);
    			}
    			int ans = 0;
    			for(int i = 0;i <= max;i++){
    				ans = ans + hh[i]*ww[i];
    			}
    			System.out.println(ans);
    		}
    	}
    }
}