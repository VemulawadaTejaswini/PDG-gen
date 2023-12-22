import java.util.*;
import java.util.Arrays;

public class Main{
        public static void main(String[] args){
                Scanner scanCnt = new Scanner(System.in);
                int N = scanCnt.nextInt();
                int M = scanCnt.nextInt();

                int Array[] = new int[M];

                int ans=0;

                for(int i = 0 ; i < N ; i++ ){
                        int K = scanCnt.nextInt();
                        for(int j = 0 ; j < K ; j++ ){
                                int num = scanCnt.nextInt();
                                for(int p=0 ; p < M ; p++){
                                        if(num==p+1){
                                                Array[p]+=1;
                                        }
                                }
                        }
                }
                for(int p=0 ; p < M ; p++){
                        if(Array[p]==N){
                                ans++;
                        }
                }

                System.out.println(ans);

        }
}