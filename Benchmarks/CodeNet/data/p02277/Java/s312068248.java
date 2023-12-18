import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Trump[] a = new Trump[n];
        Trump[] b = new Trump[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Trump(sc.next(), sc.nextInt());
            b[i] = a[i];
        }
        quickSort(a, 0, a.length - 1);
        mergeSort(b, 0, a.length);
        boolean isStable = Arrays.deepEquals(a, b);
        System.out.println(isStable ? "Stable" : "Not stable");
        printArray(a);
    }

    private static void quickSort(Trump[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            quickSort(a, left, p - 1);
            quickSort(a, p + 1, right);
        }
    }

    private static int partition(Trump[] a, int left, int right) {
        int partition = a[right].num;
        int i = left;
        for (int j = left; j < right; j++) {
            if (a[j].num <= partition) {
                Trump tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
            }
        }
        Trump tmp = a[i];
        a[i] = a[right];
        a[right] = tmp;
        return i;
    }

    private static void printArray(Trump[] array) {
        if (array.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i].type).append(" ").append(array[i].num).append("\n");
        }
        System.out.print(sb);
    }

    static class Trump {

        String type;
        int num;

        public Trump(String type, int num) {
            this.type = type;
            this.num = num;
        }
    }

    private static void mergeSort(Trump[] s, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(s, left, mid);
            mergeSort(s, mid, right);
            merge(s, left, mid, right);
        }
    }

    private static void merge(Trump[] s, int left, int mid, int right) {
        Trump[] L = new Trump[mid - left + 1];
        Trump[] R = new Trump[right - mid + 1];
        System.arraycopy(s, left, L, 0, L.length - 1);
        System.arraycopy(s, mid, R, 0, R.length - 1);
        L[L.length - 1] = new Trump("", Integer.MAX_VALUE);
        R[R.length - 1] = new Trump("", Integer.MAX_VALUE);
        for (int i = 0, j = 0, k = left; k < right; k++) {
            if (L[i].num <= R[j].num) {
                s[k] = L[i];
                i++;
            } else {
                s[k] = R[j];
                j++;
            }
        }
    }
}