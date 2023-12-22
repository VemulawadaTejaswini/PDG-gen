import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] red = new String[N];
    for (int i=0; i<N; i++) {
      red[i] = sc.next();
    }
    int M = sc.nextInt();
    String[] blue = new String[M];
    for (int i=0; i<M; i++) {
      blue[i] = sc.next();
    }
    int[] countN = new int[N];
    for (int i=0; i<N; i++) {
      countN[i] =1;
      for (int j=i+1; j<N; j++) {
        if (red[i].equals(red[j])) {
          countN[i]++;
        }
      }
      for (int k=0; k<M; k++) {
        if (red[i].equals(blue[k])) {
          countN[i]--;
        }
      }
    }
    int max =0;
    for (int i=0; i<N; i++) {
      if (countN[i] > max) {
        max = countN[i];
      }
    }
    System.out.println(max); 
  }
}