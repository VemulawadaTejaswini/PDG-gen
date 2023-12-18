import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] menu = new int[5];
        //        String s = sc.next();

        int ans = 0;
        int max = 0;
        int idx = 0;
        //        boolean ans = false;

        for (int i = 0; i < 5; i++) {
            menu[i] = sc.nextInt();
            if (max < (10 - (menu[i] % 10)) && (10 - (menu[i] % 10)) != 10) {
                max = 10 - (menu[i] % 10);
                idx = i;
            }
        }

        //        if ((Math.abs(ant[0] - ant[1]) > k) )
        //            ans = true;

        sc.close();

        for (int i = 0; i < 5; i++) {
            if (idx != i) {
                if ((10 - (menu[i] % 10)) == 10) {
                    ans += menu[i];
                } else {
                    ans += menu[i] + (10 - (menu[i] % 10));
                }
            }
        }
        ans += menu[idx];
        //        System.out.println(ans ? ":(" : "Yay!");
        System.out.println(ans);

    }
}