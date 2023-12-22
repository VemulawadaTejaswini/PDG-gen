import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        int hugCount = 0;
        int readFinish = S.length() / 2;
        if (S.length() % 2 != 0) {
            readFinish++;
        }
        for (int i = 0; i < readFinish; i++) {
            char a = S.charAt(i);
            char b = S.charAt(S.length() - 1 - i);
            if (a != b) {
                hugCount++;
            }
        }

        System.out.println(hugCount);

    }

}