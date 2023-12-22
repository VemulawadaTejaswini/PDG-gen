import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sheet[][] = new int[N][2];
        int ans = 0;
        for (int i = 0; N > i; i++) {
            sheet[i][0] = sc.nextInt();
            sheet[i][1] = sc.nextInt();
        }
        for (int j = 0; N > j; j++) {
            for (int t = sheet[j][0]; sheet[j][1] >= t; t++) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}