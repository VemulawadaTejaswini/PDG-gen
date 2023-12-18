import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer A[] = new Integer[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        while(true) {
            Arrays.sort(A);
            int min = 0;
            boolean f = false;
            for (int i = 0; i < N; i++) {
                if(A[i] == 0) continue;
                if(min==0) {
                    min=A[i];
                    continue;
                }

                A[i] = A[i] % min;
                if (A[i] != 0) f = true;
            }
            if (!f) {
                System.out.println(min);
                return;
            }
        }

//        System.out.println(B - A);
    }
}
