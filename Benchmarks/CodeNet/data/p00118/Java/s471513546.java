import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new aoj0118().doIt();
    }
    class aoj0118{
    	//Map?????????
    	char map[][] = new char[102][102];
    	boolean check[][] = new boolean[102][102];
    	int H,W;
    	int mh[] = {0,1,0,-1};
    	int mw[] = {1,0,-1,0};
    	
    	//??±???????????¢?´¢
    	void dfs(int h,int w,char c){
    		for(int i = 0;i < 4;i++){
    			int movew = mw[i] + w;
    			int moveh = mh[i] + h; 
    			if(movew >= 0 && moveh >= 0
    					&& movew < W && moveh < H){
    				if(map[moveh][movew] == c && check[moveh][movew] == false){
    					check[moveh][movew] = true;
    					dfs(moveh,movew,c);
    				}
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			H = sc.nextInt();
    			W = sc.nextInt();
    			if(H+W == 0)break;
    			for(int i = 0;i < 102;i++){
    	            for(int j = 0;j < 102;j++){
    	                check[i][j] = false;
    	            }
    	        }
    			//??\???
    			for(int i = 0;i < H;i++){
    				String str = sc.next();
    				char ctr[] = str.toCharArray();
    				for(int j = 0;j < W;j++){
    					map[i][j] = ctr[j];
    				}
    			}
    			int cnt = 0;
    			
    			//??¢?´¢????§?
    			for(int i = 0;i < H;i++){
    				for(int j = 0;j < W;j++){
    					if(!check[i][j]){
    						check[i][j] = true;
    						dfs(i,j,map[i][j]);
    						cnt++;
    					}
    				}
    			}
    			System.out.println(cnt);
    		}
    		return;
    	}
    }
}