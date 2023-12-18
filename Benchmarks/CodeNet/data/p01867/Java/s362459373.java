
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new C().doIt();
    }
    class C{
    	int alf[] = new int [128];
    	void doIt(){
    		int n = sc.nextInt();
    		String str = sc.next();
    		char ctr[] = str.toCharArray();
    		for(int i = 0;i < n;i++){
    			if(i % 2 == 0)alf[ctr[i]]++;
    		}
    		int ans = 0;
    		for(int i = 1;i <= 9;i++){
    			int num = 0;
    			for(char c = 'a';c <= 'z';c++){
    				if(alf[c] == i)num++;
    			}
    			if(i == 1){
    				if(num > 0){
    					if(ans > 0)ans = ans + 1;
    					ans = ans + (num*2)-1;
    				}
    			}else{
    				if(num == 1){
    					if(ans > 0)ans = ans + 1;
    					ans = ans + 3;
    				}
    				else if(num > 1){
    					if(ans > 0)ans = ans + 1;
    					ans = ans + (2*num) + 3;
    				}
    			}
    		}
    		System.out.println(ans);
    	}
    }
}