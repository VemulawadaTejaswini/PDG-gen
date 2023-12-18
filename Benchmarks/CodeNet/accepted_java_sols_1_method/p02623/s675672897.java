import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        long[] A = new long[N];
        long[] B = new long[M];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            B[i] =  sc.nextInt();
        }


        long sum=0;
        int bidx = -1;
        int count=0;
        for (int i = 0; i < M ; i++) {
            if(sum+B[i] <=K){
                sum += B[i];
                bidx =i;
                count++;
            }else{
                break;
            }
        }


        int ans = count;//A zero books

        for (int i = 0; i < N; i++) {
            long bookA = A[i];
            sum += bookA;
            count++;
            while(sum>K && bidx>=0){//remvoe books in B
                sum -= B[bidx];
                count--;
                bidx--;
            }
            if(sum>K){
                break;
            }
            ans = Math.max(ans,count);
        }

        System.out.println(ans);
    }
}