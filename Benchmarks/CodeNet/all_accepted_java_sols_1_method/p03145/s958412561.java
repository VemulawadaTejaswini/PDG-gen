import java.util.*;
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
      int array[] = {A,B,C};
      Arrays.sort(array);
      System.out.println(array[0]*array[1]/2);
      
    }
}