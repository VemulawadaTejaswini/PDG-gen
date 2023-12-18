import java.util.Scanner;
     
public class Main {
    	
    private final static Scanner sc = new Scanner(System.in);
    	
    public static void main(String[] arg) {
    	int N = sc.nextInt();
    	int b = sc.nextInt();
      	int sum = 2 * b;
      	int b2;
      	for(int i = 0; i < N-2; i++) {
        	b2 = sc.nextInt();
          	if(b2 < b) {
              sum = sum - b + b2;
            }
          	b = b2;
          	sum += b;
        }
      	System.out.println(sum);
          
   	}
}