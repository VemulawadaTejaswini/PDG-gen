import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer[] array = new Integer[N];
    
    int sumLength = 0;
    
    for(int i = 0; i < N; i++){
      array[i] = sc.nextInt();
    }
    
    Arrays.sort(array,Comparator.reverseOrder());
    
    for( int i =0; i < K ; i++) {
      sumLength += array[i];
    }
    
    System.out.println(sumLength);   
  }
}