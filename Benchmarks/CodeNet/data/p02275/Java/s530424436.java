import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] counts = new int[10001];
        int[] sorted = new int[n];

        for(int i = 0; i < A.length; i++) {
            counts[A[i]]++;
        }

        
        for(int i = 1; i < counts.length; i++) {
            counts[i] += counts[i-1];
        }

        for(int i = A.length - 1; i >= 0; i--) {
            int index = counts[A[i]] - 1;
            sorted[index] = A[i];
            counts[A[i]]--;
        }
        printArray(sorted);
    }

    public static void printArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append(a[0]);
        for(int i = 1; i < a.length; i++) {
            sb.append(" ");
            sb.append(a[i]);
        }
        System.out.println(sb.toString());
    }
}