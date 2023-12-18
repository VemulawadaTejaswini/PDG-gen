
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
    	int ans(String str,int length){
    		TreeSet<String> ts = new TreeSet<String>();
    		ArrayList<String> array = new ArrayList<String>();
    		ArrayList<Integer> array2 = new ArrayList<Integer>();
    		ts.add(str);array.add(str);array2.add(0);
    		int num = 0;
    		while(array.size() > 0){
    			boolean out = true;
    			str = array.remove(0);
    			num = array2.remove(0);
//    			System.out.println(str+" "+num);
				for(int j=0;j<length-1;j++)if(str.charAt(j)!=str.charAt(j+1))out = false;
				if(out)return num;
				for(int j = 0;j < length-1;j++)if(str.charAt(j)!=str.charAt(j+1)){
					String str2 = str.substring(0,j)+check(str.substring(j,j+2))+str.substring(j+2,length);
//					System.out.println(cnt+" "+str+" "+str2+" "+ts.size());
					if(ts.add(str2)){
						array.add(str2);
						array2.add(num+1);
					}
				}
			}
    		return -1;
    	}
    	void doIt(){
    		while(true){
    			String str = sc.next();	
    			if(str.equals("0"))break;
    			int a = ans(str,str.length());
    			System.out.println(a == -1 ? "NA":a);
    		}
    	}
    }
}