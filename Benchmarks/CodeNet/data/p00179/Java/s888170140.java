
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
    		return "rr";
    	}
    	int ans(String str,int cnt,int length){
    		ArrayList<String> ts = new ArrayList<String>();
    		ts.add(str);
    		while(cnt <= length){
				cnt++;
				int tssize = ts.size();
				for(int i = 0;i < tssize;i++){
					str = ts.remove(0);
//					System.out.println(cnt+" "+str);
					boolean out = true;
					for(int j=0;j<length-1;j++){
						if(str.charAt(j)!=str.charAt(j+1))out = false;
					}
					if(out)return cnt-1;
					for(int j = 0;j < length-1;j++)if(str.charAt(j)!=str.charAt(j+1)){
						String str2 = str.substring(0,j)+check(str.substring(j,j+2))+str.substring(j+2,length);
//						System.out.println(cnt+" "+str+" "+str2+" "+ts.size());
						if(!ts.contains(str2))ts.add(str2);
					}
				}
			}
    		return -1;
    	}
    	void doIt(){
    		while(true){
    			String str = sc.next();	
    			if(str.equals("0"))break;
    			int a = ans(str,0,str.length());
    			System.out.println(a == -1 ? "NA":a);
    		}
    	}
    }
}