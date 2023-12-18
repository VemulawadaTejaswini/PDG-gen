import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] rating = new int[n];
    int[] number = new int[9];
    for(int i = 0; i < 9; i++) number[i] = 0;
    for(int i = 0; i < n; i++) {
      rating[i] = Integer.parseInt(sc.next());
      number[Math.min(rating[i]/400, 8)]++;
    }
    int min = 0;
    for(int i = 0; i < 8; i++) {
      if(number[i] != 0) min++;
    }
    if(min == 0) {
      min = 1;
      number[8]--;
    }
    System.out.print(min + " ");
    int max = min + number[8];
    System.out.println(max);
  }
}
