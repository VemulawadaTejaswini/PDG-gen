import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        comp(scan.nextInt(), scan.nextInt(), scan.nextInt());
    }

    private static void comp(int a,int b, int c) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}