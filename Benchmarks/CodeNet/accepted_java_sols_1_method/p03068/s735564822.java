import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char target = S.charAt(sc.nextInt() - 1);
        char[] array = new char[N];
        for (int i = 0; i < N; i++) {
            char curr = S.charAt(i);
            array[i] = (curr == target) ? target : '*';
        }
        System.out.println(new String(array));
    }
}
