import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
	  
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int[] result = new int[3];
    int max = Math.max(X, Y);
    int min = Math.min(X, Y);
    int max_value = 0;
    if(max == X){
    	max_value = A;
    }
    if(max == Y){
    	max_value = B;
    }
    
    result[0] = 2 * C * max;
    result[1] = 2 * C * min + (max-min) * max_value;
    result[2] = A * X + B * Y;
    Arrays.sort(result);
    
    System.out.println(result[0]);
  }
}