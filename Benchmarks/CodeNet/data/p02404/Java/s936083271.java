
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        int[] H = new int[10000];
        int[] W = new int[10000];
        int a = 0;
        int b = 0;

        Scanner s = new Scanner(System.in);
        for (int i = 0; ; i++) {
            H[i] = s.nextInt();
            W[i] = s.nextInt();
            if ((H[i] == 0) && (W[i] == 0)) {
                break;
            }
        }
        for (int I = 0; H[I] != 0; I++) {
            b = H[I];
            while (b > 0) {
                a = W[I];
                if ((b == H[I]) || (b == 1)) {
                    while (a > 0) {
                        System.out.print('#');
                        a--;
                    }
                } else {
                    a--;
                    System.out.print('#');
                    while(a > 1){
                        System.out.print('.');
                        a--;
                    }
                    System.out.print('#');
                }
                System.out.println("");
                b--;
            }
            System.out.println("");
        }
    }
}

