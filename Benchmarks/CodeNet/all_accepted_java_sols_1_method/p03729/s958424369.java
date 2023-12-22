    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan=new Scanner(System.in);
    		
    		String a=scan.next();
    		String b=scan.next();
    		String c=scan.next();
    		
    		if (a.charAt(a.length()-1)==b.charAt(0)&& b.charAt(b.length()-1)==c.charAt(0)) {
    			System.out.print("YES");
    		}else {
    			System.out.print("NO");
    		}

    		
    	
  
    				
    	}
     
    }