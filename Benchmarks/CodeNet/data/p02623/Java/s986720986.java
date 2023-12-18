import java.util.Scanner;

public class Main {

    private static int i;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        long M=sc.nextLong();
        long K=sc.nextLong();
        int max = 0;
        long[] An = new long[(int)N+1];
        long[] Bn = new long[(int)M+1];
        for(int i=1; i<=N; i++){
            An[i]=sc.nextLong();
        }
        for(int i = 1; i <=M; i++){
            Bn[i] = sc.nextLong();
        }
        for(int i=1; i<=N; i++){
            An[i]+=An[i-1];
        }
        for(int i=1; i<=M; i++){
            Bn[i]+=Bn[i-1];
        }

        for(int i=0; i<=N; i++){    //上から
            if(An[i] <=K){
                long rest = K - An[i];
                int tmp = i;        //読めた本数
                int index = upperBound(Bn , rest);
                if(index == -1){
                    index = (int)M;
                }else{
                    index--;
                }
                tmp+=index;
                max = Math.max(max,tmp);
            }
            else{
                //
            }

        }
        lp(max);

    }
    public static void lp(Object o){
        System.out.println(o);
    }
    public static final int lowerBound(final long[] arr, final long value) {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if(low<arr.length) {
            return low;
        }
        else {
            return -1;
        }
    }

    public static final int upperBound(final long[] arr, final long value) {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if(low<arr.length) {
            return low;
        }
        else {
            return -1;
        }
    }
}
