import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
      	int b = in.nextInt();
      	int c = in.nextInt();
      
      int now = a-b;
      int ans = c-now;
      
      if(ans<0){ans=0;}
      System.out.print(ans);
      
	}
}
