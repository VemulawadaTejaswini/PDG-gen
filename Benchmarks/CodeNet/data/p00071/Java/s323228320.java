
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
    	new aoj0130().doIt();
    }
    class aoj0130{
    	class Pos{
    		int x,y;
    		public Pos(int x,int y) {
    			this.x = x;
    			this.y = y;
    		}
    	}
    	ArrayList<Pos> array = new ArrayList<Pos>();
    	int mx[] = {0,1,0,-1};
    	int my[] = {1,0,-1,0};
    	void bomb(int num){
    		int map[][] = new int [8][8];
    		for(int i = 0;i < 8;i++){
    			String str = sc.next();
    			char ctr[] = str.toCharArray();
    			for(int j = 0;j < 8;j++){
    				if(ctr[j] == '0')map[i][j] = 0;
    				else map[i][j] = 1;
    			}
    		}
    		array.add(new Pos(sc.nextInt()-1,sc.nextInt()-1));
    		while(array.size() > 0){
    			Pos p = array.remove(0);
    			for(int i = 0;i < 4;i++){
    				for(int j = 0;j < 4;j++){
    					if(p.x + mx[j]*i >= 0 && p.x + mx[j]*i < 8 
    							&& p.y + my[j]*i >= 0 && p.y + my[j]*i < 8){
    						if(map[p.y + my[j]*i][p.x + mx[j]*i] == 1){
    							array.add(new Pos(p.x + mx[j]*i,p.y + my[j]*i));
    							map[p.y + my[j]*i][p.x + mx[j]*i] = 0;
    						}
    					}
    				}
    			}
    		}
    		System.out.println("Data "+num+":");
    		for(int i = 0;i < 8;i++){
    			for(int j = 0;j < 8;j++){
    				System.out.print(map[i][j]);
    			}
    			System.out.println();
    		}
    	}
    	void doIt(){
    		int n = sc.nextInt();
    		for(int i = 0;i < n;i++){
    			bomb(i+1);
    		}
    	}
    }
}