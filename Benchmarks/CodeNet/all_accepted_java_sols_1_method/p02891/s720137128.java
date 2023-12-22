import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int c = 1;
        for (int i = 0 ; i < s.length - 1; i++) {
            if (s[i] == s[i + 1]) {
                c++;
            } else {
                list.add(c);
                c = 1;
            }
        }
        list.add(c);
        long d = 0;
        if (list.size() == 1) {
            long f = (long ) list.get(0) * k;
            System.out.println(f/2);
            return;
         }

        if (s[0] != s[s.length-1]) {
            for (int i = 0 ; i < list.size() ; i++) {
                long e = (long) list.get(i) / 2;
                d += e * k;
            }
        } else {
            for (int i = 1 ; i < list.size() - 1 ; i++) {
                long e = (long) list.get(i) / 2;
                d += e * k;
            }
            long f =( (long) list.get(0) + (long) list.get(list.size() - 1)) / 2;
            d += f * (k - 1) + (long) list.get(0) / 2 + (long) list.get(list.size()-1)/2;
        }

        System.out.println(d);

    }

}
