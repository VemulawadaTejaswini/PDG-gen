import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        sc.close();

        int all = 0;
        int min = Integer.MAX_VALUE;
        int eat = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int taste = l + (i + 1) - 1;
//            System.out.println(taste);
            all += taste;
            if (Math.abs(taste) < min) {
                min = Math.abs(taste);
                eat = taste;
            }
        }
//        System.out.println(all);
        System.out.println(all - eat);
    }

}
