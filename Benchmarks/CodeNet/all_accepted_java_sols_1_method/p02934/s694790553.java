import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
        double nam = 0;
      
      for(int i = 0;i < a ;i++){
      nam += 1.0/in.nextDouble();
      }
      System.out.print(1.0/nam);
	}
}