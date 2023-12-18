import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int q = N;
        do {
            int r = Math.abs(q % (-2));
            list.add(r);
            q = (q - r) / (-2);
        } while (q != 0);
        String res = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            res += list.get(i);
        }
        System.out.println(res);
        sc.close();
    }
}