import java.util.*;

public class Main {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        String ans = "";
        selectionSort(A, N);
        for (int i = 0; i < N ; i++) {
            ans += A[i] + " ";
        }
        System.out.println(ans.substring(0, ans.length()-1));
        System.out.println(cnt);
    }

    static void selectionSort(int[] A, int N){
        int tmp;
        for (int i = 0; i < N; i++) {
            int min_j = i;
            for (int j = i; j < N; j++) {
                if(A[j] < A[min_j]) min_j = j;
            }
            if(A[i] != A[min_j]) cnt++;
            tmp = A[i];
            A[i] = A[min_j];
            A[min_j] = tmp;
        }
    }
}

