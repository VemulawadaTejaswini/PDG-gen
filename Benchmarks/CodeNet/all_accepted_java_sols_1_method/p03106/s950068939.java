import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> divsA = new ArrayList<>();
        List<Integer> divsB = new ArrayList<>();
        for (int i = 1; i <= a; ++i) {
            if (a % i == 0) divsA.add(i);
        }
        for (int i = 1; i <= b; ++i) {
            if (b % i == 0) divsB.add(i);
        }

        List<Integer> divs = new ArrayList<>();
        for (int i = 0; i < divsA.size(); ++i) {
            for (int j = 0; j < divsB.size(); ++j) {
                if (divsA.get(i) == divsB.get(j)) {
                    divs.add(divsA.get(i));
                }
            }
        }

        System.out.println(divs.get(divs.size() - k));
    }
}