import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
      	int length = sc.nextInt();
      	int time = sc.nextInt();
      	int sokudo = sc.nextInt();
      
      	if(length / sokudo <= time) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");        	
        }
    
    }
}