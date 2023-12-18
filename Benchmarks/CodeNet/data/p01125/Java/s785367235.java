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
    	void doIt(){
    		while(true){
    			boolean map[][] = new boolean[21][21];
    			int n = sc.nextInt();
    			if(n == 0)break;
    			int x,y;
    			for(int i = 0;i < n;i++){
    				x = sc.nextInt();y = sc.nextInt();
    				map[y][x] = true;
    			}
    			x = 10;y = 10;
    			int n2 = sc.nextInt();
    			int cnt = 0;
    			if(map[y][x])cnt++;
    			for(int i = 0;i < n2;i++){
    				String s = sc.next();
    				int num = sc.nextInt();
    				if(s.equals("N")){
    					for(int j = 0;j < num;j++){
    						if(map[++y][x])cnt++;
    					}
    				}else if(s.equals("E")){
    					for(int j = 0;j < num;j++){
    						if(map[y][++x])cnt++;
    					}
    				}else if(s.equals("S")){
    					for(int j = 0;j < num;j++){
    						if(map[--y][x])cnt++;
    					}
    				}else{
    					for(int j = 0;j < num;j++){
    						if(map[y][--x])cnt++;
    					}
    				}
    			}
    			if(cnt == n)System.out.println("Yes");
    			else System.out.println("No");
    		}
    	}
    }
}