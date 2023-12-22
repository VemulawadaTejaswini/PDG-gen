import java.util.Scanner;

public class Main {
  
  	private final static Scanner sc = new Scanner(System.in);
    public static void main (String [] args) {
      int N = sc.nextInt();
      long K = sc.nextInt();
      long Q = sc.nextInt();
      long [] array = new long[N];
      for(int i = 0; i < Q; i++) {
        array[sc.nextInt() -1]++;
      }
      for(int i = 0; i < N; i++) {
        if((K + array[i] - Q) > 0) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
   }
}
