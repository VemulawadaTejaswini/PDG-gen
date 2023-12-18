import java.util.HashSet;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var x = scaner.nextInt();
        var n = scaner.nextInt();

        var set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scaner.nextInt());
        }
        var ans = x;
        for (int i = 0; i < 101; i++) {
            var up = x+i;
            var down = x-i;
            if (!set.contains(down)) {
                ans = down;
                break;
            }
            if (!set.contains(up)) {
                ans = up;
                break;
            }

        }

        System.out.println(ans);

        scaner.close();
    }

}
