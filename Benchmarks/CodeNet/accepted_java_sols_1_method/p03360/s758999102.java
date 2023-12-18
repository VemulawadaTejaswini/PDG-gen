import java.util.*;
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
      int K = sc.nextInt();
      int[] array = {A,B,C};
      Arrays.sort(array);
      int ans = array[0]+array[1];
      int count = array[2];
      for (int i=0; i<K; i++) {
        count *= 2;
      }
      System.out.println(ans+count);
    }
}