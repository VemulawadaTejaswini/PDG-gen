import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) A.add(sc.nextInt());

        List<Integer> ASorted = new ArrayList<>(A);
        ASorted.sort(Comparator.reverseOrder());
        int max = ASorted.get(0);
        int secondLargest = ASorted.get(1);

        for (int i = 0; i < N; i++) {
            if (A.get(i) == max)
                System.out.println(secondLargest);
            else
                System.out.println(max);
        }



    }
}
