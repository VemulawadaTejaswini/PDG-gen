import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      	int tarPri = sc.nextInt();
      	int num1y = sc.nextInt();
      	
      	if(tarPri %500 <= num1y) {
			System.out.println("Yes");          
        } else {
        	System.out.println("No");  
        }
	}
}