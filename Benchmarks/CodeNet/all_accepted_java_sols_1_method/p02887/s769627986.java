import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String sli = scan.next();
        int count = N;
        char latestChar = sli.charAt(0);
        for (int i = 1; i < sli.length(); i++) {
            if (latestChar == sli.charAt(i)) {
                count--;
            }
            latestChar = sli.charAt(i);
        }
        System.out.println(count);
    }
}
