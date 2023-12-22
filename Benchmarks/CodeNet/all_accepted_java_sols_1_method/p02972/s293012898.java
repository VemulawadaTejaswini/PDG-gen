import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, j, temp, sum = 0;
    number_n = Integer.parseInt(sc.next());
    int[] number = new int[number_n];
    int[] ball = new int [number_n];
    Arrays.fill(ball, 0);
    for (i = 0; i < number_n; i++) number[i] = Integer.parseInt(sc.next());
    for(i = number_n; i > 0; i--) {
      temp = 0;
      for(j = i; j <= number_n; j += i) {
        if(ball[j-1] == 1) temp++;
      }
      if(temp % 2 != number[i-1]) {
        ball[i-1] = 1;
        sum++;
      }
    }
    System.out.println(sum);
    temp = 0;
    for(i = 0; i < number_n; i++) {
      if(ball[i] == 1) {
        temp++;
        if(temp == sum) System.out.println((i + 1));
        else System.out.print((i + 1) + " ");
      }
    }
  }
}
