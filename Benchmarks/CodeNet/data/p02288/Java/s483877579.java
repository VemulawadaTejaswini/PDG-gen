
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static class PriorityQueue<T> {

        private Comparator<T> comparator;
        private T[] array;
        private int lastIdx = 0;
        private Class clazz;

        public PriorityQueue(Comparator<T> comparator, Class clazz) {
            this(comparator, clazz, 50);
        }

        public PriorityQueue(Comparator<T> comparator, T[] array) {
            this.comparator = comparator;
            if (array.length == 0 || array[1] == null) {
                throw new IllegalArgumentException("array should have at least one element at index 1");
            }
            this.clazz = array[1].getClass();
            this.array = array;
            heapify();
        }

        private void heapify() {
            lastIdx = array.length - 1;
            for (int i = array.length / 2; i >= 1; i--) {
                sink(i);
            }
        }

        @SuppressWarnings("unchecked")
        public PriorityQueue(Comparator<T> comparator, Class clazz, int initialCapacity) {
            this.comparator = comparator;
            this.clazz = clazz;
            array = (T[]) Array.newInstance(clazz, initialCapacity);
        }

        private void swim(int k) {
            while (k > 1 && less(k / 2, k)) {
                exch(k / 2, k);
                k = k / 2;
            }
        }

        private void sink(int k) {
            while (2 * k <= lastIdx) {
                int largerChild = 2 * k;
                if (largerChild + 1 <= lastIdx && less(largerChild, largerChild + 1)) {
                    largerChild++;
                }
                if (!less(k, largerChild)) {
                    break;
                }
                exch(k, largerChild);
                k = largerChild;
            }
        }

        private void exch(int i, int j) {
            T key = array[i];
            array[i] = array[j];
            array[j] = key;
        }

        private boolean less(int i, int j) {
            return comparator.compare(array[i], array[j]) < 0;
        }

        public T peek() {
            return lastIdx == 0 ? null : array[1];
        }

        public T pop() {
            if (lastIdx == 0) {
                return null;
            }
            exch(1, lastIdx);
            T top = array[lastIdx--];
            sink(1);
            return top;
        }

        @SuppressWarnings("unchecked")
        public void insert(T key) {
            if (lastIdx == array.length - 1) {
                T[] newArray = (T[]) Array.newInstance(clazz, array.length * 2);
                for (int i = 1; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }
            array[++lastIdx] = key;
            swim(lastIdx);
        }

        public boolean isEmpty() {
            return lastIdx == 0;
        }

        public int size() {
            return lastIdx;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] array = new Integer[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = in.nextInt();
        }
        PriorityQueue<Integer> maxPQ = new PriorityQueue<Integer>(
                new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }, array);
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + array[i]);
        }
    }
}