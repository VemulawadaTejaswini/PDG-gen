import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, number_of_jewelries, answer = 0;
    number_of_jewelries = Integer.parseInt(sc.next());
    int[] value = new int[number_of_jewelries];
    int[] cost = new int[number_of_jewelries];
    for(i = 0; i < number_of_jewelries; i++) {
      value[i] = Integer.parseInt(sc.next());
    }
    for(i = 0; i < number_of_jewelries; i++) {
      cost[i] = Integer.parseInt(sc.next());
    }
    for(i = 0; i < number_of_jewelries; i++) {
      if(value[i] - cost[i] > 0) answer += (value[i] - cost[i]);
    }
    System.out.println(answer);
  }
}
