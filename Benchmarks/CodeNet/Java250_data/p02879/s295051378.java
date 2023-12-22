import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int A = scanner.nextInt();
      	int B = scanner.nextInt();
      
      	if(A / 10 == 0 && B / 10 == 0) {
        	System.out.println(A * B);
         	return;
        }
      	System.out.println("-1");
	}
}
 

 

