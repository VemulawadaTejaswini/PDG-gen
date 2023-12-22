import java.util.Scanner;
     
public class Main {
    	
    private final static Scanner sc = new Scanner(System.in);
    	
    public static void main(String[] arg) {
    	String tipp = sc.next();
      	String real = sc.next();
      	int sum = 0;
      	for(int i = 0; i < 3; i++) {
        	char t = tipp.charAt(i);
          	char r = real.charAt(i);
          	if(r == t) {
              sum++;
            }
        } 
      	System.out.println(sum);
   	}
}