    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan=new Scanner(System.in);
    		
    		int a=Integer.parseInt(scan.next());
    		int b=Integer.parseInt(scan.next());
    		
    		if (a==b) {
    			System.out.print("Draw");
    		}else if (a==1||b==1) {
    			System.out.print(a==1?"Alice":"Bob");
    		}else {
    			System.out.print(a>b?"Alice":"Bob");
    		}
    				
    	}
     
    }