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
    	char map[][];
    	boolean check[][];
    	int mh[] = {0,1,0,-1};
    	int mw[] = {1,0,-1,0};
    	void dfs(int h,int w,char c,int H,int W){
    		for(int i = 0;i < 4;i++){
    			int movew = mw[i] + w;
    			int moveh = mh[i] + h; 
    			if(movew >= 0 && moveh >= 0
    					&& movew < W && moveh < H){
    				if(map[moveh][movew] == c && check[moveh][movew] == false){
    					check[moveh][movew] = true;
    					dfs(moveh,movew,c,H,W);
    				}
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			int W = sc.nextInt();
    			int H = sc.nextInt();
    			if(H+W == 0)break;
    			map = new char[102][102];
    			check = new boolean[102][102];
    			for(int i = 0;i < H;i++){
    				String str = sc.next();
    				char ctr[] = str.toCharArray();
    				for(int j = 0;j < W;j++){
    					map[i][j] = ctr[j];
    				}
    			}
    			int cnt = 0;
    			for(int i = 0;i < H;i++){
    				for(int j = 0;j < W;j++){
    					if(!check[i][j]){
    						if(map[i][j] == '@' || map[i][j] == '*' || map[i][j] == '#'){
    							check[i][j] = true;
    							dfs(i,j,map[i][j],H,W);
    							cnt++;
    						}
    					}
    				}
    			}
    			System.out.println(cnt);
    		}
    	}
    }
}