    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan =new Scanner(System.in);
    		String s=scan.next();
    		
    		int len=s.length();
    		
    		int ans=3;
    		for(int i=0;i<len;++i) {
    			if(s.charAt(i)!=s.charAt(len-i-1)) {
    				--ans;

    				break;
    			}
    		}
    		
    		for(int i=0;i<(len-1)/2;++i) {
    			if(s.charAt(i)!=s.charAt((len-1)/2-i-1)) {
    				--ans;

    				break;
    			}
    		}
    		int j=0;
    		for(int i=(len+3)/2-1;i<len;++i) {
    			if(s.charAt(i)!=s.charAt(len-j-1)) {
    				--ans;

    				break;
    			}
    			++j;
    		}
    		
    		if(ans==3) {
    			System.out.print("Yes");
    		}else {
    			System.out.print("No");
    		}
    		
    }
    }
// end 