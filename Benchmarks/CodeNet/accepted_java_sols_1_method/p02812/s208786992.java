import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 0;
        for (int i = 0 ; i < n - 2 ; i++) {
            if (s.subSequence(i, i + 3).equals("ABC")) {
                c++;
            }
        }
        System.out.println(c);
    }

}
