import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A;
        A = new int[n];
        int count = 0;
        for(int i=0;i<n;++i){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;++i){
            for(int j=0;j<n-1;++j){
                if(A[j] > A[j+1]){
                    int c;
                    c = A[j];
                    A[j] = A[j+1];
                    A[j+1] = c;
                    count++;
                }
            }
        }
        print(A, n);
        System.out.println(count);
    }

    public static void print(int A[], int n){
        for(int i=0;i<n;++i){
            System.out.print(A[i]);
            if(i<n-1){System.out.print(" ");}
        }
        System.out.println();
    }
}


