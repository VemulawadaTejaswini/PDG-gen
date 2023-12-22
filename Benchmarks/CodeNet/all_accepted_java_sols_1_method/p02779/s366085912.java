import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            set.add(stdIn.nextInt());
        }

        if (set.size() == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
