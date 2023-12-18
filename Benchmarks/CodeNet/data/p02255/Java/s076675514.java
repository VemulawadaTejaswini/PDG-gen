import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = null;

        int num = Integer.parseInt(sc.nextLine());

        String[] a = sc.nextLine().split(" ");
        int[] array = new int[num];

        for(int i=0; i<num; i++) {
            array[i] = Integer.parseInt(a[i]);
        }

        printResult(array);

        for (int i = 1; i < num; i++) {
            int v = array[i];
            int j = i - 1;
            while ( j>=0 && array[j]>v ) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = v;

            printResult(array);
        }
    }

    public static void printResult(int[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<array.length; i++) {
            if (i!=0) { sb.append(" "); }
            sb.append(array[i]);
        }

        System.out.println(sb.toString());
    }
}

/*
1 insertionSort(A, N) // N個の要素を含む0-オリジンの配列A
2   for i が 1 から N-1 まで
3     v = A[i]
4     j = i - 1
5     while j >= 0 かつ A[j] > v
6       A[j+1] = A[j]
7       j--
8     A[j+1] = v
*/
