import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int r = sc.nextInt();
      	int D = sc.nextInt();
      	int x2000 = sc.nextInt();
      
      	for(int i = 0; i < 10; i++) {
        	System.out.println(r * x2000 - D);
          	x2000 = (r * x2000 - D);
        }
    }
}