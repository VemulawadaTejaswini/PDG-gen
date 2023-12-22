import java.util.Scanner;

public class Main {
    // https:// atcoder.jp/contests/abc101/tasks/abc101_b
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        char[] inputCharArray = input.toCharArray();

        int sn = 0;
        for (int i = 0; i < inputCharArray.length; i++) {
            sn = sn + (int) Character.getNumericValue(inputCharArray[i]);
        }

        String answer = (double) Integer.parseInt(input) % sn == 0 ? "Yes" : "No";

        System.out.println(answer);

        scan.close();

    }

}
