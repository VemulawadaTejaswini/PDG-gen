
import java.util.Scanner;

public class Main {
    public static void select_Sort(int n, int A[]) {
        int min = 0;
        int mini = 0;
        int x=0;
        int sortNum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(j==i+1){
                    min=A[j];
                    mini=j;
                }
                if(min > A[j]){
                    min=A[j];
                    mini=j;
                }
            }
            if (A[i] > A[mini]) {
                x = A[mini];
                A[mini] = A[i];
                A[i] = x;
                sortNum++;
            }
        }
        System.out.printf("%d", A[0]);
        for (int k = 1; k < n; k++) {
            System.out.printf(" %d", A[k]);
        }
        System.out.printf("\n");
        System.out.println(sortNum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        select_Sort(n, A);
        return;
    }
}
