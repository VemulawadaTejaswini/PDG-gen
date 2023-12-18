import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] oddCount = new int[100010];
    int[] evenCount = new int[100010];

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        int e_ = sc.nextInt();
        evenCount[e_]++;
      } else {
        int o_ = sc.nextInt();
        oddCount[o_]++;
      }
    }

    sc.close();

    int oddMaxCount = 0;
    int oddMaxNumber = 0;
    for (int i = 0; i < 100010; i++) {
      if (oddMaxCount < oddCount[i]) {
        oddMaxCount = oddCount[i];
        oddMaxNumber = i;
      }
    }

    int evenMaxCount = 0;
    int evenMaxNumber = 0;
    for (int i = 0; i < 100010; i++) {
      if (evenMaxCount < evenCount[i]) {
        evenMaxCount = evenCount[i];
        evenMaxNumber = i;
      }
    }

    int oddSecondCount = 0;
    for (int i = 0; i < 100010; i++) {
      if (oddSecondCount < oddCount[i] && i != oddMaxNumber) {
        oddSecondCount = oddCount[i];
      }
    }

    int evenSecondCount = 0;
    for (int i = 0; i < 100010; i++) {
      if (evenSecondCount < evenCount[i] && i != evenMaxNumber) {
        evenSecondCount = evenCount[i];
      }
    }

    int min = 0;

    if (oddMaxNumber != evenMaxNumber) {
      min += n / 2 - oddMaxCount;
      min += n / 2 - evenMaxCount;
    } else {

      int min1 = n / 2 - oddMaxCount;
      min1 += n / 2 - evenSecondCount;
      
      int min2 = n / 2 - evenMaxCount;
      min2 += n / 2 - oddSecondCount;
      
      min = Math.min(min1, min2);
    }

    System.out.println(min);

  }

}