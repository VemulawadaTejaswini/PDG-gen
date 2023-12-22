
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        int[] H = new int[10000];
        int[] W = new int[10000];
        int a = 0;
        int b = 0;
        boolean flg = true;
        boolean flg2 = true;

        Scanner s = new Scanner(System.in);
        for (int i = 0; ; i++) {
            H[i] = s.nextInt();
            W[i] = s.nextInt();
            if ((H[i] == 0) && (W[i] == 0)) {
                break;
            }
        }
        for (int I = 0; H[I] != 0; I++) {
            a = H[I];
            while (a > 0) {
                b = W[I];
                if (flg) {
                    while (b > 0) {
                        if (flg2) {
                            System.out.print('#');
                            flg2 = false;
                        } else {
                            System.out.print('.');
                            flg2 = true;
                        }
                        b--;
                    }
                    flg2 = true;
                    flg = false;
                } else {
                    while (b > 0) {
                        if (flg2) {
                            System.out.print('.');
                            flg2 = false;
                        } else {
                            System.out.print('#');
                            flg2 = true;
                        }
                        b--;
                    }
                    flg2 = true;
                    flg = true;
                }
                System.out.println("");
                a--;
            }
            flg =true;
            System.out.println("");

        }


    }
}

