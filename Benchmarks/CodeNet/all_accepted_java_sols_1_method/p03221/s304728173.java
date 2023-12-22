import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[M+1];
    int[] Y = new int[M+1];
    for (int i = 1; i <M+1; i++) {           
      P[i] = sc.nextInt();       
      Y[i] = sc.nextInt();
    }
    
    String[] result = new String[P.length+1]; //Pの桁数
    int[] count = new int[N + 1]; 
    int[] list = 
      IntStream.range(0, P.length)
      .boxed()
      .sorted((i1, i2) -> Integer.compare(Y[i1], Y[i2]))
      .mapToInt(x -> x).toArray();
    for (int index : list) {
      count[P[index]]++;
      result[index] = String.format("%06d%06d", P[index], count[P[index]]);
    }
    for (int i =1; i<=M; i++) {
      System.out.println(result[i]);
    }
  }
}