import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean flg = true;

        ArrayList<Integer> intList = new ArrayList<Integer>();

         while(flg) {

            int n = scan.nextInt();
            int m = scan.nextInt();
            int p = scan.nextInt();

            scan.nextLine();

               // 選手数
            int num = 0;
            int xm = 0;

            if (n == 0 && m == 0 && p == 0) {
                flg = false;
            } else {
                for (int i = 0; i < n; i++) {
                    int x = scan.nextInt();

                    if (i == m - 1) {
                        xm = x;
                    }
                    num = num + x;
                }
                scan.nextLine();

                int y = 0;

                if (xm != 0) {
                    y = (int)((double)num * (100 - p) / xm);
                }

                intList.add(y);
            }
        }
        

        scan.close();

        for(int j : intList) {
            System.out.println(j);
        }
    }
}
