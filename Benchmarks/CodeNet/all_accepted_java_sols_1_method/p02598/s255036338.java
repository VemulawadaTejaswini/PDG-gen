import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] Az = new long[N];
        long maxA = 0;
        for (int i = 0; i < N; i++){
            Az[i] = sc.nextLong();
            if (maxA < Az[i]){
                maxA = Az[i];
            }
        }
        long left = 0;
        long right = maxA;
        long mid = 0;
        int cutCnt = 0;
        long minNo = maxA+1;
        long ans = maxA;
        long nextToAns = maxA;
        int cnt = 0;
        int cannotFindFlg = 0;
        while (left < right){
            mid = (left + right)/2;
            if (mid == 0) break;
            cutCnt = 0;
//            System.out.println(left +" "+right+" mid "+mid+" "+cnt+" ans "+ans+" "+(cutCnt > K)+" "+cutCnt);
            for (int i = 0; i < N; i++){
//                System.out.println(mid +" Az[i] "+Az[i]+" "+(Math.ceil((double) Az[i] / mid)));
                cutCnt += Math.ceil((double) Az[i] / mid) - 1;
            }
//            System.out.println("cutCnt "+cutCnt);
            if (cutCnt > K){
                minNo = mid;
//                right = mid;
                left = mid + 1;
            } else {
                ans = mid;
//                if (minNo == ans + 1){
//                    System.out.println("aa");
//                    cannotFindFlg = 1;
//                    nextToAns = mid;
//                    break;
//                }
//                left = mid + 1;
                right = mid;
            }
//            System.out.println(left +" "+right+" mid "+mid+" "+cnt+" ans "+ans+" "+(cutCnt > K)+" "+cutCnt);
            cnt++;
//            if (cnt == 10) break;
        }
//        if (cannotFindFlg == 0){
        System.out.println(ans);
//        } else {
//            System.out.println(nextToAns);
//        }

    }
}
