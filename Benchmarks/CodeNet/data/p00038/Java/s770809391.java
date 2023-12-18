import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	while(sc.hasNext()){
    		new aoj0038().doIt();
    	}
    }
    class aoj0038{
    	String check(int cnt[]){
    		if(cnt[2] == 1)return "four card";
    		else if(cnt[1] == 1 && cnt[0] == 1)return "full house";
    		else if(cnt[1] == 1)return "three card";
    		else if(cnt[0] == 2)return "two pair";
    		else if(cnt[0] == 1)return "one pair";
    		return "null";
    	}
    	void doIt(){
    		int a[] = new int [18];
    		int cnt[] = new int [3];
    		boolean st = true;
    		String str[] = sc.next().split(",");
    		for(int i = 0;i < 5;i++){
    			a[Integer.parseInt(str[i]) - 1]++;
    		}
    		for(int i = 0;i < 13;i++){
    			if(a[i] == 2)cnt[0]++;
    			else if(a[i] == 3)cnt[1]++;
    			else if(a[i] == 4)cnt[2]++;
    		}
    		for(int i = 0;i < 13;i++){
    			if(a[i] == 1 && a[i+1] == 1 && a[i+2] == 1
    					&& a[i+3] == 1 && a[(i+4)%13] == 1){
    				System.out.println("straight");
    				st = false;
    			}
    		}
    		if(st)System.out.println(check(cnt));
    	}
    }
}