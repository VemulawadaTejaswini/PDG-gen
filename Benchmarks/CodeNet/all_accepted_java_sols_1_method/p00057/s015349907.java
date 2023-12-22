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
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println((n * n + n + 2) / 2);
        }
    }
}