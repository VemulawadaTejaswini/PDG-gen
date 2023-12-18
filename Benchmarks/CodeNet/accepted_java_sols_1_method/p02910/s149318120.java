import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String line = sc.nextLine();
    	
    	boolean resultFlag = true;
    	
    	//case even
    	for(int i = 0;i<line.length();i++) {
    		if(i%2 == 1) {
    			char tmp = line.charAt(i);
    			if( tmp != 'L' && tmp != 'U' && tmp != 'D') {
    				resultFlag = false;
    			}
    		}
    	}
    	
    	
    	//case odd
    	for(int i = 0;i<line.length();i++) {
    		if(i%2 == 0) {
    			char tmp = line.charAt(i);
    			if( tmp != 'R' && tmp != 'U' && tmp != 'D') {
    				resultFlag = false;
    			}
    		}
    	}

    	if(resultFlag) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    	
    	
    	
    }
}