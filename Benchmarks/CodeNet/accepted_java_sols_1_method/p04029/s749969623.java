import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
        int x = sc.nextInt();
     
        int count = 0;
      
        for (int i=1; i < x+1; i++) {
          count = count + i;
          //System.out.println("count is " + count);
        }
        System.out.println(count);
	} 
}