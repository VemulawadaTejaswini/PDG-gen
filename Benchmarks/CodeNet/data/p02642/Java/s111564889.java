import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> A = new ArrayList<Integer>();
    for (int i =0; i<N; i++) {
      A.add(sc.nextInt());
    }
    Collections.sort(A);
    int count =0;
    L:for (int i =A.size()-1; i>=0; i--) {
      int j =0;
      int a = A.get(i);
      if (a < A.size()-1 && a == A.get(i+1)) continue L;
      while (j < i) {
        if (a % A.get(j) ==0) {
          continue L;
        } else {
          j++;
        }
      }
      count++;
      if (A.get(0) == A.get(1)) count--;
    }
    System.out.println(count);
  }
}