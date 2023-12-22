import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int i=1;
      while(i*1000<N){
        	i++;
      }
      System.out.println(i*1000-N);
    }
}