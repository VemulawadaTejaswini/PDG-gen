import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 1 2 3 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> ai = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ai.add(sc.nextInt());
        }
        List<Integer> sorted = new ArrayList<>(ai);
        sorted.sort(Comparator.naturalOrder());

        int medLow = sorted.get(N / 2 - 1);
        int medHigh = sorted.get(N / 2);

        for (int a : ai) {
            System.out.println((a <= medLow) ? medHigh : medLow);
        }
    }
}
