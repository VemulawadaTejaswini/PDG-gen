import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int tmp = x;

        boolean flg = false;


        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < n; j++) {
                if (array[j] == x - i){
                    flg = true;
                }
            }

            if (flg == false) {
                System.out.println(x - i);
                return;
            }

            flg = false;

            for (int j = 0; j < n; j++) {
                if (array[j] == x + i){
                    flg = true;
                }
            }

            if (flg == false) {
                System.out.println(x + i);
                return;
            }

            flg = false;


        }







        sc.close();
    }

}