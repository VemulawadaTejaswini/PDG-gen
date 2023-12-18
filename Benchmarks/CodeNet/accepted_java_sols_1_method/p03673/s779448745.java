import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] input = new int[n];
    for(int i = 0; i < n; i++) {
      input[i] = Integer.parseInt(sc.next());
    }
    int[] ans = new int[n];
    int temp = n;
    if(temp % 2 == 0) {
      for(int i = 0; i < n; i++) {
        if(temp % 2 == 0 && temp != 0) {
          ans[i] = input[temp-1];
          temp -= 2;
        } else if(temp == 0) {
          ans[i] = input[0];
          temp += 3;
        } else {
          ans[i] = input[temp-1];
          temp += 2;
        }
      }
    } else {
      for(int i = 0; i < n; i++) {
        if(temp % 2 == 1 && temp != 1) {
          ans[i] = input[temp-1];
          temp -= 2;
        } else if(temp == 1) {
          ans[i] = input[0];
          temp += 1;
        } else {
          ans[i] = input[temp-1];
          temp += 2;
        }
      }
    }
    for(int i = 0; i < n - 1; i++) {
      System.out.print(ans[i] + " ");
    }
    System.out.println(ans[n-1]);
  }
}
