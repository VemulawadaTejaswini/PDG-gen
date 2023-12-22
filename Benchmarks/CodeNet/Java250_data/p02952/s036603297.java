import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int count = 0;
        for (int i = 1; i <= N; i++) {
            String str = String.valueOf(i);
            if (str.length() % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}