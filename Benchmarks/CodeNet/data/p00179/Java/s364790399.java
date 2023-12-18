
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
    	String check(String s){
    		if(s.equals("rb") || s.equals("br"))return "gg";
    		else if(s.equals("rg") || s.equals("gr"))return "bb";
    		else if(s.equals("gb") || s.equals("bg"))return "rr";
    		return s;
    	}
    	void doIt(){
    		while(true){
    			String str = sc.next();	
    			int length = str.length();
    			if(str.equals("0"))break;
    			ArrayList<String> ts = new ArrayList<String>();
    			ts.add(str);
    			String r ="",g = "",b = "";
    			for(int i = 0;i < length;i++){
    				r = r + 'r';
    				g = g + 'g';
    				b = b + 'b';
    			}
    			int cnt = 0;
    			boolean out = false;
    			if(str.equals(r) || str.equals(g) || str.equals(b))out = true;
    			else{
    				while(cnt < length){
    					if(out)break;
    					cnt++;
    					int tssize = ts.size();
//    					System.out.println(tssize);
    					for(int i = 0;i < tssize;i++){
    						if(out)break;
    						str = ts.remove(0);
    						for(int j = 0;j < length-1;j++){
    							String str2 = str.substring(0,j)+check(str.substring(j,j+2))+str.substring(j+2,length);
    							if(str2.equals(r) || str2.equals(g) || str2.equals(b)){
    								out = true;
    								break;
    							}
//    							System.out.println(cnt+" "+str+" "+str2+" "+ts.size());
    							if(!ts.contains(str2))ts.add(str2);
    						}
    					}
    				}
    				if(out)System.out.println(cnt);
    				else System.out.println("NA");
    			}
    		}
    	}
    }
}