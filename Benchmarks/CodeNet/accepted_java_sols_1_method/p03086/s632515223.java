import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int longestCount = 0;
        String longestACGT = "";
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {

          char char1 = s.charAt(i);
          if (char1 == 'A' || char1 == 'G' || char1 == 'T' || char1 == 'C'){
            cnt = 1;
            for (int j = i+1; j < s.length(); j++) {
              char char2 = s.charAt(j);
              if (char2 == 'A' || char2 == 'G' || char2 == 'T' || char2 == 'C') {
                cnt++;
                } else {
                break;
                }
              }
            }
          if (cnt > longestCount) {
            longestCount = cnt;
          }
        }

        System.out.println(longestCount);
        scanner.close();
    }
}
