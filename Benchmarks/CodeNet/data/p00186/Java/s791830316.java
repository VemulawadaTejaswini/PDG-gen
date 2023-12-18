import java.util.Scanner;

public class Main {
    static int man[];
    static int ans;

    /**
     * @param args
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        while (true) {
            int q1 = sc.nextInt();
            if (q1 == 0)
                break;
            int b = sc.nextInt();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int q2 = sc.nextInt();
            int buy_aizu = Math.min(q2, b / c1);
            b -= buy_aizu * c1;
            int buy_norm = b / c2;
            int total = buy_aizu + buy_norm;
            if (total < q1)
                for (int i = 1; i <= q2; i++) {
                    total = (int) ((buy_aizu - i) + (c1 * i / c2 + 1+buy_norm));

                    if (total >= q1) {
                        buy_aizu -= i ;
                        buy_norm += c1 * i/ c2 +1;
                        break;
                    }
                }
            if (total >= q1 && buy_aizu > 0)
                System.out.println(buy_aizu + " " + buy_norm);
            else
                System.out.println("NA");
        }
    }
}