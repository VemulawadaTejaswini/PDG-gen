import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 解説pdfとyoutube確認後

        Scanner sc = new Scanner(System.in);
        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        String S = sc.nextLine();

        int happy = 0;
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                happy++;
            }
        }
        int happiest = N - 1;
        int changeHappy = happy + 2 * K;
        int ans = Math.min(happiest, changeHappy);
        System.out.println(ans);
    }
}
