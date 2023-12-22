import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int ct = 0;
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                int target = A[i] + A[j];
                int difference = N - 1 - j;
                int maxValidIndex;
                if(A[N - 1] < target) {
                    maxValidIndex = N - 1;
                } else {
                    //binary search maximum valid k
                    //0,...,i,...,j,j+1,...N-1
                    int offset = 0;
                    for(int b = difference; b >= 1; b /= 2) {
                        while(b+offset < difference &&A[b + offset + j] < target) {
                            offset += b;
                        }
                    }
                    maxValidIndex = j + offset;
                }
                ct += (maxValidIndex - j);
            }
        }

        System.out.println(ct);
    }
}
