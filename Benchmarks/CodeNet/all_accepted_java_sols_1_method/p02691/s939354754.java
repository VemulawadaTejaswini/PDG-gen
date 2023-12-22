import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N+1];
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int in = scanner.nextInt();
            A[i] = in;
            counter.put(i - in, counter.getOrDefault(i - in, 0) + 1);
        }

        long R = 0L;
        for (int i = 1; i <= N; i++) {
            int key = A[i] + i;

            if (counter.containsKey(key)){
                R += counter.get(key);
            }

            key = i - A[i];
            if (counter.get(key) == 1){
                counter.remove(key);
            } else {
                counter.put(key, counter.get(key)-1);
            }
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        new Main();
    }
}
