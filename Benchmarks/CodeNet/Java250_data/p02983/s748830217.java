import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 2019;
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        if (l + 2020 <= r) {
            System.out.println(0);
        }
        else {
            for (int i = l; i <= r; i++) {
                for (int j = i+1; j <= r; j++) {
                    int x = i % 2019;
                    int y = j % 2019;
                    int z = x*y;
                    num = Math.min(num, z % 2019);
                }
            }
            System.out.println(num);
        }
    }
}