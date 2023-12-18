import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String inputLine =  scanner.nextLine();
        System.out.println(inputLine);
        String[] input = inputLine.split(" ");
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

// 1 insertionSort(A, N) // N個の要素を含む0-オリジンの配列A
// 2   for i が 1 から N-1 まで
// 3     v = A[i]
// 4     j = i - 1
// 5     while j >= 0 かつ A[j] > v
// 6       A[j+1] = A[j]
// 7       j--
// 8     A[j+1] = v


        // sort
        for (int i = 1; i < count; i++) {
            int v = numbers[i];
            int j = i - 1;
            while ((j >= 0) && (numbers[j] > v)) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = v;
            
            StringJoiner joiner = new StringJoiner(" ");
            Arrays.stream(numbers).forEach(n -> joiner.add(Integer.toString(n)));
            
            System.out.println(joiner.toString());
        }
    }
}

