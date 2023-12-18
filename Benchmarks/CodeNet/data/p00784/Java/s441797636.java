import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new C().doIt();
    }
    class C{
    	boolean all[][] = new boolean[5][401];
    	ArrayList<Point2D> array = new ArrayList<Point2D>();
    	int result = 0;
    	int n = 0;
    	void dfs(int deep,int num){
    		if(deep == 10){
//    			System.out.println(num);
//    			check();
    			result = Math.min(result,num);
    		}else{
    			for(int i = 1;i <= n;i++){
    				if(num+i >= result)continue;
    				int cnt = 0;
    				for(int j = 0;j < array.size();j++){
    					if(!all[(int)array.get(j).getY()][(int)array.get(j).getX() + num + i])cnt++;
    				}
    				if(cnt == n){
    					for(int j = 0;j < array.size();j++)all[(int)array.get(j).getY()][(int)array.get(j).getX() + num + i] = true;
//    					check();
    					dfs(deep+1,num+i);
    					for(int j = 0;j < array.size();j++)all[(int)array.get(j).getY()][(int)array.get(j).getX() + num + i] = false;
    				}
    			}
    		}
    	}
    	void clear(){
    		for(int i = 0;i < 5;i++){
    			for(int j = 0;j < 401;j++){
    				all[i][j] = false;
    			}
    		}
    		array.clear();
    	}
    	void check(){
    		for(int i = 0;i < 5;i++){
    			for(int j = 0;j < 40;j++){
    				System.out.print(all[i][j] ? 1:0);
    			}
    			System.out.println();
    		}
    	}
    	void doIt(){
            while(true){
            	n = sc.nextInt();
            	if(n == 0)break;
            	result = Integer.MAX_VALUE;
            	clear();
            	boolean map[][] = new boolean[5][n];
            	for(int i = 0;i < 5;i++){
            		String str = sc.next();
            		for(int j = 0;j < n;j++){
            			if(str.charAt(j) == 'X'){
            				map[i][j] = true;
            				array.add(new Point2D.Double(j,i));
            			}
            			else map[i][j] = false;
//            			System.out.print(map[i][j] ? 1:0);
            		}
//            		System.out.println();
            	}
            	for(int i = 0;i < array.size();i++){
//            		System.out.println(array.get(i).getX()+" "+array.get(i).getY());
            		all[(int)array.get(i).getY()][(int)array.get(i).getX()] = true;
            	}
//            	check();
            	dfs(1,0);
            	System.out.println(result+n);
            }
        }
    }
}