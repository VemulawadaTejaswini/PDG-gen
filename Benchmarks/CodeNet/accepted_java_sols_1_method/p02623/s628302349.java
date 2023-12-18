import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //机Aに積まれている本
        int M = sc.nextInt(); //机Bに積まれている本
        long K = sc.nextLong(); //合計所要時間

        long[] A = new long[N+1];
        for (int i = 0; i < N; i++) {
            A[i+1] = A[i] + sc.nextLong();
        }

        long[] B = new long[M+1];
        for (int i = 0; i < M; i++) {
            B[i+1] = B[i] + sc.nextLong();
        }

        long count = 0;
        int j = M;
        
        for(int i=0;i <= N;i++){
          	// （最大時間-Aの現在の冊数を読むまでにかかる時間）
          	// で選択可能なBの最大冊数
            long bestB = K - A[i];
            // Bの最大冊数が0→最大時間 < Aの現在の冊数
          	// →もう読めない
            if(bestB < 0) break;
          	// 現時点のAの冊数(最大かもしれない)に対し、
          	// 選択可能なBの冊数
            while(j > 0 && B[j] > bestB) j--;
          	// AとBの合計冊数が一番多くなる組み合わせを
          	// countに代入
            count = Math.max(count, i+j);
        }

//        int aCnt = 0;
//        int bCnt = 0;
//        for (int i = 0; i < (A.length + B.length); i++) {
//            if (aCnt < A.length && bCnt < B.length) {
//                if (A[aCnt] < B[bCnt]) {
//                    if ((K < time)) break;
//                    if((K - time) < A[aCnt]) break;
//                    time += A[aCnt];
//                    aCnt++;
//                    count++;
////                    System.out.println("if1");
//                } else {
//                    if ((K < time)) break;
//                    if((K - time) < B[bCnt]) break;
//                    time += B[bCnt];
//                    bCnt++;
//                    count++;
////                    System.out.println("if2");
//                }
//            } else if (aCnt < A.length) {
//                if ((K < time)) break;
//                if((K - time) < A[aCnt]) break;
//                time += A[aCnt];
//                aCnt++;
//                count++;
////                System.out.println("if3");
//            } else if (bCnt < B.length){
//                if ((K < time)) break;
//                if((K - time) < B[bCnt]) break;
//                time += B[bCnt];
//                bCnt++;
//                count++;
////                System.out.println("if4");
//            } else {
//                break;
//            }
//        }

        System.out.println(count);
    }
}