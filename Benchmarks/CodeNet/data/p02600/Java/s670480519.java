import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
      	int rate = scanner.nextInt();
      
      	if(rate >= 1800) {
        	System.out.println("1");
        } else if(rate >= 1600) {
        	System.out.println("2");
        } else if(rate >= 1400) {
        	System.out.println("3");        
        } else if(rate >= 1200) {
        	System.out.println("4");        
        } else if(rate >= 1000) {
        	System.out.println("5");        
        } else if(rate >= 800) {
        	System.out.println("6");
        } else if(rate >= 600) {
        	System.out.println("7");
        } else {
        	System.out.println("8");
        }
    
    }
}