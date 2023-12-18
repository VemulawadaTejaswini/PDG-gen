import java.util.*;

public class Main {
  public static void main(String[] args) {
    int number_n, number_m, i, max_left = 0, min_right = (int)Double.POSITIVE_INFINITY, answer;
    Scanner sc = new Scanner(System.in);
    number_n = Integer.parseInt(sc.next());
    number_m = Integer.parseInt(sc.next());
    int[] card_left = new int[number_m];
    int[] card_right = new int[number_m];
    for(i = 0; i < number_m; i++) {
      card_left[i] = Integer.parseInt(sc.next());
      card_right[i] = Integer.parseInt(sc.next());
      if(card_left[i] > max_left) max_left = card_left[i];
      if(card_right[i] < min_right) min_right = card_right[i];
    }
    answer = (min_right >= max_left)? min_right - max_left + 1 : 0;
    System.out.println(answer);
  }
}
