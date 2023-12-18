import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String s=sc.nextLine();
	    char[] c=s.toCharArray();
	    
	    int len=s.length();
	    int ans10=0;
	    int ans01=0;
	    
	    for(int i=0;i<len;i++) {
	    	if(i%2==0) {
	    		if(c[i]=='0') {
	    			ans10++;
	    		}else if(c[i]=='1') {
	    			ans01++;
	    		}
	    	}else if(i%2==1){
	    		if(c[i]=='0') {
	    			ans01++;
	    		}else if(c[i]=='1') {
	    			ans10++;
	    		}
	    	}
	    

	    }
	    
	    int ans=ans10<ans01?ans10:ans01;
	    System.out.println(ans);
	    
	}

}
