import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            if ((n | k | m) == 0)
                break;
            List<Integer> ns = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++)
                ns.add(i);
            int rest = n;
            int i = m - 1;
            while (true) {
                rest--;
                if (rest == 0) {
                    System.out.println(ns.get(i));
                    break;
                }
                ns.remove(i);
                i = (i - 1 + k) % ns.size();
            }
        }
    }
}