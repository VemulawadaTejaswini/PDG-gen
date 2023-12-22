import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i ++) {
            set.add(sc.nextLine());
        }

        System.out.println(set.size());
    }
}
