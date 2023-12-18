import java.util.HashSet;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var n = scaner.nextInt();

        var a_list = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a_list.add(scaner.nextInt());
        }

        var ans = 0;
        for (Integer ai : a_list) {
            var isDivisible = true;
            for (Integer aj : a_list) {
                if (ai == aj) continue;
                if (ai % aj == 0) {
                    isDivisible = true;
                    break;
                }
                isDivisible = false;
            }
            if (!isDivisible) ans++;
        }

        System.out.println(ans);

        scaner.close();
    }

}
