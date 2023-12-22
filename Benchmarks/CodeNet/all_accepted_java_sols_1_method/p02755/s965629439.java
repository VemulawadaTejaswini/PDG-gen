import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = Integer.parseInt(s.next());
        int B = Integer.parseInt(s.next());
        double a = 0.08;
        double b = 0.1;
        List<Integer> aRet = new ArrayList<>();
        for (int i = 1; i <= 1_000; i++) {
            int ret = (int) (i * a);
            if (ret == A) {
                aRet.add(i);
            }
            if (A < ret) {
                break;
            }
        }
        List<Integer> bRet = new ArrayList<>();
        for (int i = 1; i <= 1_000; i++) {
            int ret = (int) (i * b);
            if (ret == B) {
                bRet.add(i);
            }
            if (B < ret) {
                break;
            }
        }

        for (int br : bRet) {
            for (int ar : aRet) {
                if (ar == br) {
                    System.out.println(ar);
                    return;
                }
            }
        }
        System.out.println(-1);
        return;
    }
}