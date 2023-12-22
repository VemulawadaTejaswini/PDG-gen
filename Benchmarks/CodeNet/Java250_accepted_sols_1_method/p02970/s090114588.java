import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        int D = in.nextInt()*2+1;
        int count = 0;
        
      while(N>0){
        N = N-D;
        count++;
      }
      
      System.out.print(count);
	}
}