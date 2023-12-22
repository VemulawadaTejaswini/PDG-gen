
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final int m = scanner.nextInt();
//    final List<Submit> submits = new ArrayList<>();
    int correct = 0;
    int penalty = 0;
    boolean[] result = new boolean[n];
    int[] wa = new int[n];

    for (int i = 0; i < m; i++) {
      int sub = scanner.nextInt();
      String res = scanner.next();
      if(res.equals("AC") && !result[sub-1]) {
        result[sub-1] = true;
      }
      if(!result[sub-1]) {
        wa[sub-1]++;
      }
    }

    for (int i = 0; i < n; i++) {
      if(result[i]) {
        penalty += wa[i];
        correct++;
      }
    }
    System.out.println(correct + " " + penalty);
  }
//    for (int i = 0; i < m; i++) {
//      submits.add(new Submit(scanner.nextInt(), scanner.next()));
//    }
//
//    List<Integer> subjects = submits.stream().map(e->e.subject).distinct().collect(Collectors.toList());
//    for (final int i : subjects) {
//      System.out.println(i);
//      List<String> iSubmits = submits.stream()
//          .filter(e -> e.subject == i)
//          .map(e -> e.result)
//          .collect(
//              Collectors.toList());
//      if (iSubmits.contains("AC")) {
//        correct++;
//        penalty += iSubmits.indexOf("AC");
//      }
//    }
//    System.out.println(correct + " " + penalty);
//  }
//
//  private static class Submit {
//
//    private int subject;
//    private String result;
//
//    Submit(int subject, String result) {
//      this.subject = subject;
//      this.result = result;
//    }
//  }
}
