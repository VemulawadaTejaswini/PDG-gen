import java.util.Random;
import java.util.Scanner;
        
        public class Main {
        	public static void main(String[] args) {
        		Scanner in = new Scanner(System.in);
        		String name = in.next();
        		int a = name.length();
        		Random rand = new Random();
        	    int num = rand.nextInt(a-2);
        		
        	    for(int i = 0;i<3;i++) {
        	    	char c = name.charAt(num+i);
        	    	System.out.print(c);
        	    }
        		
        	}
        }