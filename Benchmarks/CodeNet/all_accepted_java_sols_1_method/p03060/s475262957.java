import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        int result = 0;
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt(); 
        List<Integer> V = new ArrayList<>(N);
        List<Integer> C = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            V.add(scan.nextInt());
        }
        for (int i = 0; i < N; i++) {
            C.add(scan.nextInt());
            if (V.get(i) > C.get(i)) {
                result += V.get(i) - C.get(i);
            }
        }
        System.out.println(result);

    }
}