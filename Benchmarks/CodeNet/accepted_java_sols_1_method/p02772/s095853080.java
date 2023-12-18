import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    String A1 = "";
    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      if (A[i] % 2 == 0) {
        count1++;
        if (A[i] % 3 == 0 || A[i] % 5 == 0) {
          count2++;
        }
      }
    }
      if (count1 == count2) {
        A1 = "APPROVED";
      } else if(count1!= count2) {
        A1 = "DENIED";
      }
      System.out.println(A1);
    }
  }