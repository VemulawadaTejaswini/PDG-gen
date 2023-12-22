import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int[] ABC = new int[3];
	      ABC[0] = sc.nextInt();
	      ABC[1] = sc.nextInt();
	      ABC[2] = sc.nextInt();
	      int K = sc.nextInt();
	      sc.close();
	      
	      Arrays.sort(ABC);
	      for(int i = 0; i < K; i++) {
	    	  	ABC[2] *= 2;
	      }
	      int answer = ABC[0] + ABC[1] + ABC[2];
	      
	      System.out.println(answer);
	      System.exit(0);
	    }
}