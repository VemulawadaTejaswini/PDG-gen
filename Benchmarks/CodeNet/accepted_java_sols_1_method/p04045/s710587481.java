import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String[] ary = new String[k];
        for (int i = 0; i < k; i++) {
            String a = sc.next();
            ary[i] = a;
        }
        first : for (int i = n; i < 100000; i++) {
            String nStr = String.valueOf(i);
            for (String str : ary) {
                if (nStr.contains(str)) {
                    continue first;
                }
            }
            System.out.println(i);
            break;
        }
    }
}