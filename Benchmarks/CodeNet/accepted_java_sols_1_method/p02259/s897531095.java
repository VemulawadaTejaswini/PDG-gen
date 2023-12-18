import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A;
        A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int Count = 0;
        int flag = 1;
        while(flag == 1){
            flag = 0;
            for(int j = N-1; j > 0; j--){
                if(A[j] < A[j-1]){
                    int tmp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = tmp;
                    flag = 1;
                    Count++;
                }
            }
        }
        for(int i = 0; i < N-1; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(A[N-1]);
        System.out.println(Count);
    }
}
