import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();

    sc.close();

    int[] time = new int[102];

    time[A+1]++;
    time[B+1]--;
    time[C+1]++;
    time[D+1]--;

    for (int i = 2; i < 101; i++) {
      time[i] += time[i-1]; 
    }

    int count = 0;

    for (int i = 1; i < 101; i++) {
      if (time[i] == 2) {
        count++;
      } 
    }

    System.out.println(count);

  }

}