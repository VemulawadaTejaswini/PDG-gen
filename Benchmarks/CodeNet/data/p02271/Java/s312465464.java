import java.util.Scanner;

public class Main{
    public static int mypow(int a, int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return a;
        }
        return a * mypow(a, n - 1);
    }

    public static int bekiSum(int[] x, int n, int i){
        int[] bec = new int[100];
        for(int j = 0; j < n; j++){
            if(((i >> j) & 1) == 1){
                bec[j] = x[j];
            }else{
                bec[j] = 0;
            }
        }
        int Sum = 0;
        for(int k = 0; k < n; k++){
            Sum += bec[k];
        }
        return Sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] M = new int[q];
        for(int i = 0; i < q; i++){
            M[i] = sc.nextInt();
        }
        int[] Sum = new int[mypow(2, n)];
        for(int i = 0; i < mypow(2, n); i++){
            Sum[i] = bekiSum(A, n, i);
        }
        int p = 0;
        for(int i = 0; i < q; i++){
            for(int j = 0; j < mypow(2, n); j++){
                if(M[i] == Sum[j]){
                    System.out.println("yes");
                    p = 1;
                    break;
                }
            }
            if(p != 1){
                System.out.println("no");
            }
            p = 0;
        }
        sc.close();
    }
}
