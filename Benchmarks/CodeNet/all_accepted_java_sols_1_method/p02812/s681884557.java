import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = in.next();
        int total = 0;
        for (int i = 0; i < s.length()-2; i++) {
            if (s.substring(i, i+3).equals("ABC")) {
                total++;
            }
        }
        System.out.println(total);
    }
}
