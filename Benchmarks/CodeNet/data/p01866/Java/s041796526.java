
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new B().doIt();
    }
    class B{
    	void doIt(){
    		int n = sc.nextInt();
    		String str = sc.next();
    		char ctr[] = str.toCharArray();
    		int m = sc.nextInt();
    		int num = n;
    		StringBuilder sb = new StringBuilder();
    		for(int i = 0;i < n;i++){
    			if(m == 0){
    				sb.append(ctr[i]);
    			}
    			else if(m < num){
    				if(ctr[i] == '0'){
    					sb.append(1);
    					m--;
    				}else{
    					sb.append(1);
    				}
    			}else{
    				if(ctr[i] == '0')sb.append(1);
    				else sb.append(0);
    			}
    			num--;
    		}
    		System.out.println(sb);
    	}
    }
}