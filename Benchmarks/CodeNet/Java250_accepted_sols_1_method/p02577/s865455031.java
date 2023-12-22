import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
    	Scanner sn = new Scanner(System.in);
      	String n = sn.next();
      	int digits = 0;
      	int sum = 0;
      	for(int i = 0; i < n.length() ; i++) {
        	digits = Integer.parseInt(n.substring(i, i+1));
          	sum = sum + digits; 
        }
      	if(sum % 9 == 0) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}