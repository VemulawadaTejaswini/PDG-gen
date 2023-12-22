import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    String[] inputs = sc.nextLine().split(" ");
    int N = Integer.parseInt(inputs[0]);
    int A = Integer.parseInt(inputs[1]);
    int B = Integer.parseInt(inputs[2]);
    List<Integer> answer = new ArrayList<>();

    for (int n = 1; n <= N; n++) {
      if (n < 10) {
        if (n >= A && n <= B) {
          answer.add(n);
        }
      } else {
        String[] nString = String.valueOf(n).split("");
        int sum = 0;
        for (String ns: nString) {
          sum += Integer.parseInt(ns);
        }
        if (sum >= A && sum <= B) {
          answer.add(n);
        }
      }
    }
    Integer sum = 0;
    for (Integer ans: answer) {
      sum += ans;
    }
    System.out.println(sum);
  }
}
