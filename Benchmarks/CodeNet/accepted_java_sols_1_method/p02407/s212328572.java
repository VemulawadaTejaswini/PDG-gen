
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int I = (n - 1); I >= 0; I--) {
            System.out.print(a[I]);
            if (I == 0) {
                break;            
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
}

