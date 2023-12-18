
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj0154().doIt();
    }
    class aoj0154{
    	int card_point[];
    	int card_num[];
    	int accept[];
    	int cnt = 0;
    	void dfs(int index,int ac_index,int result,int max_n){
    		if(accept[ac_index] == result){
    			cnt++;
    		}else if(index < max_n){
    			for(int i = 0;i <= card_num[index];i++){
    				if(result + (i*card_point[index]) > accept[ac_index])break;
    				else{
    					dfs(index+1,ac_index,result + (i*card_point[index]),max_n);
    				}
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			card_point = new int[n];
    			card_num = new int[n];
    			for(int i = 0;i < n;i++){
    				card_point[i] = sc.nextInt();
    				card_num[i] = sc.nextInt();
    			}
    			int m = sc.nextInt();
    			accept = new int[m];
    			for(int i = 0;i < m;i++){
    				accept[i] = sc.nextInt();
    			}
    			for(int i = 0;i < m;i++){
    				cnt = 0;
    				dfs(0,i,0,n);
    				System.out.println(cnt);
    			}
    		}
    	}
    }
}