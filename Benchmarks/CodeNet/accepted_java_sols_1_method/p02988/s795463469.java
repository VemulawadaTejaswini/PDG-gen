import java.util.*;

public class Main {
  public static void main(String[] args) {
    int i, number_n, count = 0;
    Scanner sc = new Scanner(System.in);
    number_n = Integer.parseInt(sc.next());
    int[] number_array = new int[number_n];
    for(i = 0; i < number_n; i++) number_array[i] = Integer.parseInt(sc.next());
    for(i = 0; i < number_n - 2; i++) {
      if((number_array[i] < number_array[i+1] && number_array[i+1] < number_array[i+2]) || (number_array[i] > number_array[i+1] && number_array[i+1] > number_array[i+2])) {
        count++;
      }
    }
    System.out.println(count);
  }
}
