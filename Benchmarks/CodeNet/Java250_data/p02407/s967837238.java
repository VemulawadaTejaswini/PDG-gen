import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A;
        int n;
        n = sc.nextInt();
        A = new int[n];

        for(int i=n-1;i>=0;--i){
            A[i] = sc.nextInt();
        }
        print(A, n);
    }

    public static void print(int A[], int n){
        for(int i=0;i<n;++i){
            System.out.print(A[i]);
            if(i<n-1){System.out.print(" ");}
        }
        System.out.println();
    }
}

