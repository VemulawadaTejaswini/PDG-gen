

import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dataCount = Integer.parseInt(scanner.nextLine());
        String[] dataString = scanner.nextLine().split(" ");
        int data[] = new int[dataCount];
        
        for (int i = 0; i < dataCount; i++) {
            data[i] = Integer.parseInt(dataString[i]);
        }

        int changeCount = 0;
        // 1 bubbleSort(A, N) // N 個の要素を含む 0-オリジンの配列 A
        // 2   flag = 1 // 逆の隣接要素が存在する
        // 3   while flag
        // 4     flag = 0
        // 5     for j が N-1 から 1 まで
        // 6       if A[j] < A[j-1]
        // 7         A[j] と A[j-1] を交換
        // 8         flag = 1
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = dataCount - 1; i >= 1; i--) {
                if (data[i] < data[i - 1]) {
                    int tmp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = tmp;
                    changeCount++;
                    flag = true;
                }
            }
        }
        
        StringJoiner joiner = new StringJoiner(" ");
        Arrays.stream(data).forEach(n -> joiner.add(Integer.toString(n)));
        System.out.println(joiner.toString());
        System.out.println(changeCount);
    }
}
