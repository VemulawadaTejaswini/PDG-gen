import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new A().doIt();
    }
    class A{
    	char alf[] = {'y','u','i','o','p','h','j','k','l','n','m'};
    	int alength = alf.length;
    	boolean check(char c){
    		for(int i = 0;i < alength;i++){
				if(c == alf[i])return true;
			}
    		return false;
    	}
    	void doIt(){
    		while(true){
    			String str = sc.next();
    			if(str.equals("#"))break;
    			char ctr[] = str.toCharArray();
    			int length = str.length();
    			boolean left = false;
    			for(int i = 0;i < alength;i++)if(ctr[0] == alf[i])left = true;
    			int cnt = 0;
    			for(int i = 0;i < length;i++){
    				if(left){
    					if(!check(ctr[i])){
    						left = false;
    						cnt++;
    					}
    				}else{
    					if(check(ctr[i])){
    						left = true;
    						cnt++;
    					}
    				}
    			}
    			System.out.println(cnt);
    		}
    	}
    }
}