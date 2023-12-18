import java.util.Scanner;

class Main{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[111];

        for (int i = 0; i < n; ++i) {
            a[i] = scan.nextInt();
        }
        int sw = bubbleSort(a, n);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n- 1 ) System.out.print(" ");
        }
        System.out.println();
        System.out.print(sw);
        System.out.println();
    }

    private static int bubbleSort(int[] A, int N) {
        // 交換回数
        int sw = 0;
        // 交換したかどうかのフラグ
        boolean flag = true;

        for (int i = 0; flag; i++) {
            flag = false;
            for (int j = N - 1; j > 0; j--) {
                if (A[j] < A[j - 1]) {
                    // 隣接要素を交換する
                    swap(A, j, j-1);
                    flag = true;
                    sw++;
                }
            }
        }
        return sw;
    }

    private static void swap(int[] A, int firstElemIdx, int secondElemIdx) {
        int tmp = A[firstElemIdx];
        A[firstElemIdx] = A[secondElemIdx];
        A[secondElemIdx] = tmp;
    }

}
