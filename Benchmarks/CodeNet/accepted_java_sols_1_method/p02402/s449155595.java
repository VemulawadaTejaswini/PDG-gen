import java.util.Scanner;
import java.util.Arrays;

class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] array = new int[N];
  long sum = 0;
  for( int i = 0; i < N; i++ ) {
   int x = sc.nextInt();
   array[i] = x;
   sum += x;
  }
  Arrays.sort(array);
  System.out.println(array[0] + " " + array[N-1] + " " + sum );
 }
} 
