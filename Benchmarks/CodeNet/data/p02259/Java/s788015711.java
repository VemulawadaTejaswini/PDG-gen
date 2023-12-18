import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = bubbleSort(a,N);
        for (int i = 0; i < N; i++) {
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println(cnt);
        
        sc.close();
    }

    static int bubbleSort(int[] A,int N)
    {
        int cnt = 0;
        boolean flag = true;
        while(flag)
        {
            flag = false;
            for (int j = N-1; j >0; j--) {
                if(A[j] < A[j-1])
                {
                    int buf = A[j];
                    A[j] = A[j-1];
                    A[j-1] = buf;
                    flag = true;
                    cnt ++;
                }
            }
        }
        return cnt;
    }
}
