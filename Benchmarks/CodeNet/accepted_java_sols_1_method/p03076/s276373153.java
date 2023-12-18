import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    Integer[][] time = new Integer[5][2];

    for (int i = 0; i < 5; i++) {
      int a = sc.nextInt();
      int b = 10 - a % 10;
      if (b == 10) {
        b = 0;
      }
      time[i][0] = b;
      time[i][1] = a;
    }
 
    sc.close();

    Arrays.sort(time, (a1,b1) -> Integer.compare(a1[0],b1[0]));

    int answer = 0;
  
    for (int i = 0; i < 5; i++) {
      if (i != 4) {
        answer += time[i][1];
        answer += time[i][0];
      } else {
        answer += time[i][1];
      } 
    }

    System.out.println(answer);

  }

}