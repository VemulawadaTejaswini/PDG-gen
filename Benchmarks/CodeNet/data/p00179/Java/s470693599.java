
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new aoj0179().doIt();
    }
    class aoj0179{
    	int [] map;
    	int num = 100;
    	int color = 'r'+'b'+'g';
    	Stack<Pair> st = new Stack<Pair>();
    	class Pair{
    		int x,y;
    		public Pair(int x,int y) {
    			this.x = x;
    			this.y = y;
    		}
    	}
    	void dfs(int cnt,int max){
    		if(cnt <= max+1){
//    			for(int i = 0;i < max+1;i++)System.out.print((char)map[i]);
//    			System.out.println(" "+cnt);
    			if(cnt < num){
    				int c = 0;
    				for(int i = 0;i < max;i++){
    					if(map[i] != map[i+1]){
    						c++;
    						st.push(new Pair(map[i],map[i+1]));
    						int color2 = color - (map[i] + map[i+1]);
    						map[i] = color2;map[i+1] = color2;
    						dfs(cnt+1,max);
    						Pair p = st.pop();
    						map[i] = p.x;
    						map[i+1] = p.y;
    					}
    					if(i == max - 1 && c == 0)num = Math.min(num, cnt);
    				}
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			num = 100;
    			String str = sc.next();	
    			if(str.equals("0"))break;
    			char ctr[] = str.toCharArray();
    			map = new int [str.length()];
    			for(int i = 0;i < str.length();i++)map[i] = (int)ctr[i];
    			dfs(0,str.length()-1);
    			if(num != 100)System.out.println(num);
    			else System.out.println("NA");
    		}
    	}
    }
}