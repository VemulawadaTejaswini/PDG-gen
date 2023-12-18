import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] A = new long[N];

//        long maxHeight = Long.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            long read =  scanner.nextLong();

            A[i] = read;
//            if (maxHeight < read) {
//                maxHeight = read;
//            }
        }



        // 全区間のmaxHeightを調べる
        // maxHeight以後をmaxHeightにするように下駄を履かせる
        // maxHeightより前の区間のmaxHeight'を調べる
        // maxHeight'以後をmaxHeight'にするように下駄を履かせる
        // 以下ループ

        long getaSum = 0;
        int maxHeightIdx = findMaxIdx(A, 0, N);
        int end = N;
        while (maxHeightIdx != -1) {
            for (int i = maxHeightIdx; i < end; i++) {
                getaSum += A[maxHeightIdx] - A[i];
            }

            end = maxHeightIdx;
            maxHeightIdx = findMaxIdx(A, 0, end);

            if (maxHeightIdx == 0) {
                for (int i = maxHeightIdx; i < end; i++) {
                    getaSum += A[maxHeightIdx] - A[i];
                }

                break;
            }
        }

        System.out.println(getaSum);
    }

    static int findMaxIdx(long[] array, int start, int end) {
        int foundMaxIdx = 0;

        for (int i = start; i < end; i++) {
            if (array[foundMaxIdx] < array[i]) {
                foundMaxIdx = i;
            }
        }

        return foundMaxIdx;
    }
}