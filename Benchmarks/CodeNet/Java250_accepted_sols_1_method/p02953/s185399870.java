import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) - list.get(i - 1) < -1) {
                System.out.println("No");
                return;
            } else if (list.get(i) - list.get(i - 1) < 0) {
                list.set(i - 1, list.get(i - 1) - 1);
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}