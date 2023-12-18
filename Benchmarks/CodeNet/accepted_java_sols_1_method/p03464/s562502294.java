import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        long[] A = new long[K];
        for(int i=0;i<K;++i){
            A[i]=scan.nextLong();
        }

        long left=2;
        long right=2;
        for(int i=K-1;i>=0;--i){
            long kleft = (left-1)/A[i] + 1;
            long kright= right/A[i];
            if(kleft > kright){
                System.out.println(-1);
                return;
            }
            left = A[i]*kleft;
            right=A[i]*kright+(A[i]-1);
        }
            System.out.println(left+" "+right);
    }
}