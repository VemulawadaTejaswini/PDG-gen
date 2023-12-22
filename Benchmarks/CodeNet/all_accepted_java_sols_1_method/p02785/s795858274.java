import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();   //the number of monster
    int A = sc.nextInt();   //the number of limit of deathblow
    long count  = 0;
    Integer[] H = new Integer[N];   //the HP of monster
    for(int i = 0;i < N;i++){
      H[i] = sc.nextInt();
    }
    Arrays.sort(H, Collections.reverseOrder());
    if(A > 0){
      for(int i = A;i < N;i++){
        count += H[i];
      }
    }else {
      for (int i = 0; i < N; i++) {
        count += H[i];
      }
    }
    System.out.println(count);
  }
}