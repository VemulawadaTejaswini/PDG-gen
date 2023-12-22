import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();

        String[] strList = S.split("");
        int length = 1;
        for (int i = 0; i < N - 1; i++) {
            if (!strList[i].equals(strList[i + 1])) {
                length++;
            }
        }
        System.out.println(length);
    }
}