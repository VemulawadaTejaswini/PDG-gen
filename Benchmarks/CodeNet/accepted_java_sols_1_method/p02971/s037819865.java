import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, max = 0, temp = 0;
    number_n = Integer.parseInt(sc.next());
    int[] number = new int[number_n];
    for(i = 0; i < number_n; i++) number[i] = Integer.parseInt(sc.next());
    for(i = 0; i < number_n; i++) {
      if(max < number[i]) {
        temp = max;
        max = number[i];
      } else if(temp < number[i]) {
        temp = number[i];
      }
    }
    for(i = 0; i < number_n; i++) {
      if(number[i] != max) System.out.println(max);
      else System.out.println(temp);
    }
  }
}
