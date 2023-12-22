import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
	
      	int N = scanner.nextInt();
      
      	if(N % 2 > 0) {
        	System.out.println("No");
          	return;
        }
      	
      	String all = scanner.next();
      	String first = all.substring(0, N / 2);
      	String second = all.substring(N / 2, N);
      
      	if(first.equals(second)) {
        	System.out.println("Yes");
          	return;
        }
      	System.out.println("No");
	}
}
 

 

