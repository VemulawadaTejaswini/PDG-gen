import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] p = new int[N]; 
    for (int i=0; i<N; i++){
      p[i] = scanner.nextInt();
    }

    Arrays.sort(p);
    int sum = 0;

    for(int i =0; i<K; i++){
      sum += p[i];
    }
   System.out.println(sum);
    scanner.close();
    return;
    

  }
}
