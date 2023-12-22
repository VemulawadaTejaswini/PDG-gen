import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      int X  = sc.nextInt();
	      int[] m = new int[N];
	      for(int i = 0; i < N; i++) {
	    	  	m[i] = sc.nextInt();
	      }
	      sc.close();
	      
	      int count = 0;
	      
	      for(int i = 0; i < N; i++) {
	    	  	X -= m[i];
	    	  	count++;
	      }
	      
	      Arrays.sort(m);
	      count += X / m[0];
	      
	      System.out.println(count);
	      System.exit(0);
	    }

}