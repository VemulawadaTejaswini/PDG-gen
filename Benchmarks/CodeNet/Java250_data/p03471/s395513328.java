import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());

        // 紙幣は0枚～N枚数まで使用できるので、Nに1加算する
        String ans = countMoney(N, Y);
        System.out.println(ans);
    }

    private static String countMoney(int N, int Y) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                int remain = Y - (i * 10000 + j * 5000);
                int use = i + j + remain / 1000;
                if (use == N && remain / 1000 >= 0) {
                    sb.append(i + " ");
                    sb.append(j + " ");
                    sb.append(String.valueOf(remain / 1000));
                    return sb.toString();
                }
            }
        }
        return "-1 -1 -1";
    }
}
