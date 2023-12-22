import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int i, j, temp;
    int[] number = new int[4];
    String[] mark = new String[3];
    for(i = 0; i < 4; i++) number[i] = input.charAt(i) - '0';
    for(i = 0; i < 2 << 3; i++) {
      temp = number[0];
      for(j = 0; j < 3; j++) {
        if((1 & i >> j) == 1) {
          temp += number[j+1];
          mark[j] = "+";
        } else {
          temp -= number[j+1];
          mark[j] = "-";
        }
      }
      if(temp == 7) {
        for(j = 0; j < 3; j++) {
          System.out.print(number[j] + mark[j]);
        }
        System.out.println(number[j] + "=7");
        break;
      }
    }
  }
}
