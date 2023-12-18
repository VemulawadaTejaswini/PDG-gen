import java.util.*;

public class Main {
    //C - Many Medians/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] X = new long[200000];
        //ArrayList<Long> X = new ArrayList();
        for(int i = 0; i < N; i++) {
            X[i] = scanner.nextLong();
        }

        long[] sortedX = Arrays.copyOfRange(X, 0, N);
        Arrays.sort(sortedX);
        long medianPrev = sortedX[sortedX.length / 2 - 1];
        long median = sortedX[sortedX.length / 2];

        for (int i = 0; i < N; i++) {
            if(X[i] <= medianPrev) {
                System.out.println(median);
            }
            else {
                System.out.println(medianPrev);
            }
        }
    }
}
