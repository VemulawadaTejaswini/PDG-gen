    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int a=Integer.parseInt(scan.next());
    		if (scan.next().contentEquals("+")) {
    			System.out.print(a+Integer.parseInt(scan.next()));
    		}else {
    			System.out.print(a-Integer.parseInt(scan.next()));
    		}
    		
    }
     
    }