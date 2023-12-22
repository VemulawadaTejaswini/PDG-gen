import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int target = sc.nextInt();
      	boolean isExist = false;
      	for(int i = 0; i <= 25; i++) {
        	for(int j = 0; j <= 14; j++) {
           		int total = 4 * i + 7 * j;
              	if(total == target) isExist = true;
            }
        }
      	if(isExist) {
          System.out.println("Yes");
        } else {
        	System.out.println("No");  
        }
    }
}