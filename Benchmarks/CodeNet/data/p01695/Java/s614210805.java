
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.io.IOException;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2583().doIt();
    }
    class aoj2583{
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			String str[] = new String[n];
    			int dot[] = new int[n];
    			int array[] = new int[n];
    			for(int i = 0;i < n;i++){
    				str[i] = sc.next();
    				char ctr[] = str[i].toCharArray();
    				int cnt = 0;
    				for(int j = 0;j < ctr.length;j++){
    					if(ctr[j] == '.')cnt++;
    					else{
    						array[i] = cnt;
    						dot[cnt]++;
    						break;
    					}
    				}
    			}
    			
    			for(int i = 0;i < n;i++){
    				if(array[i] == 0){
    					dot[array[i]]--;
    					System.out.println(str[i]);
    				}else if(array[i] == 1){
    					dot[array[i]]--;
    					System.out.println("+"+str[i].substring(1,str[i].length()));
    				}else{
    					dot[array[i]]--;
    					for(int j = 1;j < array[i];j++){
							if(dot[array[j]] >= 1)System.out.print("|");
							else System.out.print(" ");
						}
    					System.out.println("+"+str[i].substring(array[i],str[i].length()));
    				}
    			}
    		}
    	}
    }
}