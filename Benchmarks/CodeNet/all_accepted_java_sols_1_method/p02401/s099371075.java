import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	while (true){
     		int[]a = new int[2];
    		a[0] = scan.nextInt();
    		String s = scan.next();
    		a[1] = scan.nextInt();
    		if(s.equals("?")){
    			break;
    		}else if(s.equals("+")){
    			System.out.println(a[0]+a[1]);
    		}else if(s.equals("-")){
    			System.out.println(a[0]-a[1]);
    		}else if(s.equals("*")){
    			System.out.println(a[0]*a[1]);
    		}else if(s.equals("/")){
    			System.out.println(a[0]/a[1]);
    		}
    		
    		
    		
    	}
   }
}