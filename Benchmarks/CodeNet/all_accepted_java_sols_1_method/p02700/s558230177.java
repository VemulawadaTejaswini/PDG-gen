import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int takahashiA = sc.nextInt();
        int takahashiKougeki = sc.nextInt();
        int aokiC = sc.nextInt();
        int aokiKougeki = sc.nextInt();

        while (takahashiA > 0 && aokiC > 0) {
            aokiC -= takahashiKougeki;
            if (aokiC <= 0) {
                System.out.println("Yes");
                break;
            }
            takahashiA -= aokiKougeki;
            if (takahashiA <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}