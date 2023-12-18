import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int contest1 = 0;
        int contest2 = 0;
        int contest3 = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if (p <= a) {
                contest1++;
            } else if (p > a && p <= b) {
                contest2++;
            } else if (p > b) {
                contest3++;
            }
        }
        int min = Math.min(contest1, contest2);
        System.out.println(Math.min(min, contest3));
    }

}
