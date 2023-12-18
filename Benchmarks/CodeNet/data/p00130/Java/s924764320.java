
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
    	void doIt(){
    		int n = sc.nextInt();
    		for(int i = 0;i < n;i++){
    			int alf[] = new int[128];
    			int alf2[] = new int[128];
    			String str = sc.next();
    			char ctr[] = str.toCharArray();
    			char start = ctr[0];
    			for(int j = 0;j < ctr.length - 1;j += 3){
    				if(ctr[j+1] == '-'){
    					alf[ctr[j]] = ctr[j+3];
    					alf2[ctr[j+3]] = ctr[j];
    					start = ctr[j+3];
    				}
    				else{
    					alf[ctr[j+3]] = ctr[j];
    					alf2[ctr[j]] = ctr[j+3];
    					start = ctr[j];
    				}
    			}
    			while(true){
    				if(alf2[start] != 0)start = (char)alf2[start];
    				else break;
    			}
    			System.out.print(start);
    			while(true){
    				if(alf[start] == 0)break;
    				System.out.print((char)alf[start]);
    				start = (char)alf[start];
    			}
    			System.out.println();
    		}
    	}
    }
}