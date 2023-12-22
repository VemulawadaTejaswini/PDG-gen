import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int num500 = sc.nextInt();
      	int num100 = sc.nextInt();
      	int num50 = sc.nextInt();
      	int targetAmount = sc.nextInt();
      	int count = 0;
      	
      	for(int i = 0; i <= num500; i++) {
        	for(int j = 0; j <= num100; j++) {
            	for(int k = 0; k <= num50; k++) {
                	int total = 500 * i + 100 * j + 50 * k;
                  	if(total == targetAmount) count++;
                }
            }
        }
      	System.out.println(count);
    }
}