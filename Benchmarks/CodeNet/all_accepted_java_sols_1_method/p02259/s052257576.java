import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++) A[i] = sc.nextInt();

        int sum = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = N-1; 0 < i ; i--){
                if(A[i] < A[i-1]){
                    int m = A[i];
                    A[i] = A[i-1];
                    A[i-1] = m;
                    sum++;
                    flag = true;
                }
            }
        }
        
        for(int i = 0; i < N; i++){
            System.out.print(A[i]);
            if(i != N - 1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(sum);

        sc.close();
    }
}
