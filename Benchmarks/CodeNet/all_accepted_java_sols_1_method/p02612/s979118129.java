
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      int ans = N%1000;
      
      if (ans == 0)
      {System.out.println(ans);}
      else
        {System.out.println(1000-ans);}
    }
}