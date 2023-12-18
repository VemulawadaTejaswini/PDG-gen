import java.util.*;

public class Main{
        public static int input;
        public static long[] arr;
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                	input = sc.nextInt();
                	arr = new long[input];
                        for (int i = 0; i < input; i++) {
                        	arr[i] = sc.nextLong();
                        }
                        for (int i = input / 2;  i >= 0; i--) {
                                maxHeapify(i);
                        }
                        for (int i = 0; i < input; i++) {
                                System.out.print(" "+arr[i]);
                        }
                        System.out.println("");
                }
        }
        public static void maxHeapify(int i) {
                int left = i * 2 + 1, right = i * 2 + 2, largest;
                if (left < input && arr[left] > arr[i]) {
                        largest = left;
                } else {
                        largest = i;
                }
                if (right < input && arr[right] > arr[largest]) {
                        largest = right;
                }

                if (largest != i) {
                        long tmp = arr[i];
                        arr[i] = arr[largest];
                        arr[largest] = tmp;
                        maxHeapify(largest);
                }
        }
}
