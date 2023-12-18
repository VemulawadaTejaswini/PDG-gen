import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dataCount = Integer.parseInt(scanner.nextLine());
        String[] dataString = scanner.nextLine().split(" ");
        int[] data = new int[dataCount];
        for (int i = 0; i < dataCount; i++) {
            data[i] = Integer.parseInt(dataString[i]);
        }
        
        int changeCount = 0;
        // 1 selectionSort(A, N) // N個の要素を含む0-オリジンの配列A
        // 2   for i が 0 から N-1 まで
        // 3     minj = i
        // 4     for j が i から N-1 まで
        // 5       if A[j] < A[minj]
        // 6         minj = j
        // 7     A[i] と A[minj] を交換
        for (int i = 0; i < dataCount; i++) {
            int min = i;
            for (int j = i; j < dataCount ; j++ ) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            
            if (i != min) {
                // swap
                int tmp = data[i];
                data[i] = data[min];
                data[min] = tmp;
                changeCount++;
            }
        }

        StringJoiner joiner = new StringJoiner(" ");
        Arrays.stream(data).forEach(n -> joiner.add(Integer.toString(n)));
            
        System.out.println(joiner.toString());
        System.out.println(changeCount);
    }
}


