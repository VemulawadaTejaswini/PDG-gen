import java.util.HashSet;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        HashSet<Integer> mochi = new HashSet<>();
        for (int i = 0; i < n; i++) {
            mochi.add(sc.nextInt());
        }
        System.out.println(mochi.size());
    }
}