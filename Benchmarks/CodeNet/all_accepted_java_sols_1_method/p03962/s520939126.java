import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      
        int colorNum = 0;
      
        if (a == b && b == c) {
          colorNum = 1;
        } else if (a == b || b == c || a == c) {
          colorNum = 2;
        } else {
          colorNum = 3;
        }
          
        System.out.println(colorNum);
	} 
}