    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		char[]n=scan.next().toCharArray();
    		for (char i:n) {
    			if(i=='1') {
    				System.out.print("9");
    			}else if(i=='9'){
    				System.out.print(1);
    			}else {
    				System.out.print(i);
    			}
    		}
    }
    }
// end 