import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[201000];
        long[] B = new long[201000];
        for(int i = 0; i < N; i++) A[i] = sc.nextLong();
        for(int i = 0; i < M; i++) B[i] = sc.nextLong();
        int readA = 0;
        int readB = 0;
        while(K >= 0){
         if (A[readA] > K && B[readB] > K) break;
         if (A[readA] == 0l) A[readA] = 10000000000l;
         if (B[readB] == 0l) B[readB] = 10000000000l;
//          System.out.println(readA);
//          System.out.println(K);
         if (A[readA] > B[readB]) {
           K -=  B[readB];
           readB++;
           continue;
         }
         if (B[readB] > A[readA]) {
           K -=  A[readA];
           readA++;
           continue;
         }
         if (A[readA] == B[readB]) {
           if (A[readA+1] > B[readB+1]) {
           K -=  B[readB];
           readB++;
           continue;
           }
           if (B[readB+1] > A[readA]+1) {
             K -=  A[readA];
             readA++;
           continue;
           }  
           if (A[readA + 1] == B[readB + 1]) {
             if (A[readA+2] > B[readB+2]) {
             K -=  B[readB];
             readB++;
           continue;
             }
             if (B[readB+2] > A[readA]+2) {
             K -=  A[readA];
             readA++;
           continue;
             }
             
           }
         }
        }
        System.out.println(readA + readB);
    } 
}