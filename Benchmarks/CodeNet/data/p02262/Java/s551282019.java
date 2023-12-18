import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());

        int[] array = scanIntArray(br, n);
        //int[] array = scanIntArray(scanner, n);

        int count = shellSort(array);
        System.out.println(count);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static int[] scanIntArray(Scanner scanner, int size) {
        return IntStream.range(0, size)
                .map(n -> Integer.parseInt(scanner.nextLine()))
                .toArray();
    }

    private static int[] scanIntArray(BufferedReader br, int size) throws IOException {
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = Integer.parseInt(br.readLine());
//        }
//        return array;
        return IntStream.range(0, size)
                .map(n -> {
                    try {
                        return Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        return -1;
                    }
                })
                .toArray();
    }

    private static int shellSort(int[] array) {
        // make intervals
        int[] intervals = new int[array.length];
        int index = 0;
        for (int h = 1; h <= array.length; h = 3 * h + 1) {
            intervals[index] = h;
            index++;
        }

        // print of intervals
        System.out.println(index);
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(intervals[i]);
            if (i != 0) System.out.print(" ");
            else System.out.println();
        }

        int sumOfCount = 0;
        for (int i = index - 1; i >= 0; i--) {
            sumOfCount += insertionSort(array, intervals[i]);
        }
        return sumOfCount;
    }

    private static int insertionSort(int[] array, int interval) {
        int length = array.length;
        int count = 0;
        for (int i = interval; i < length; i++) {
            int v = array[i];
            int j = i - interval;
            while (j >= 0 && array[j] > v) {
                swap(array, j + interval, j);
                j -= interval;
                count++;
            }
            array[j + interval] = v;
        }
        return count;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}

