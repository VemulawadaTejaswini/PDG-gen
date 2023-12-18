import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        Arrays.sort(A);

        TreeMap<Long, Long> counter = new TreeMap<>();
        long R = 0;

        counter.put(A[N-1], 1L);
        for (int i = N-2; i >= 0 ; i--) {
            long key = counter.floorKey(Long.MAX_VALUE);
            R += key;
            if(counter.get(key) == 1L){
                counter.remove(key);
            } else {
                counter.put(key, counter.get(key)-1L);
            }
            counter.put(A[i], counter.getOrDefault(A[i],0L) + 2L);
        }

        System.out.println(R);
    }

    public static void main(String[] args){
        new Main();
    }
}
