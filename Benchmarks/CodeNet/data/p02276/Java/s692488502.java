import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int p = partition(a, 0, a.length - 1);
        printArray(a, p);
    }

    private static int partition(int[] a, int left, int right) {
        int partition = a[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (a[j] <= partition) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
            }
        }
        int tmp = a[i];
        a[i] = a[right];
        a[right] = tmp;
        return i;
    }

    private static void printArray(int/*or long*/[] array, int p) {
        if (array.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == p) {
                sb.append("[").append(array[i]).append("]");
            } else {
                sb.append(array[i]);
            }
            if (i != array.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}