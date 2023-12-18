import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            B[i] = A[i];
        }
        Arrays.sort(A, Comparator.reverseOrder());
        int max = A[0];
        int second = A[1];

    //処理
        for (int i=0;i<N;i++){
            System.out.println((B[i]==max)?second:max);
        }
        sc.close();

    }
}
