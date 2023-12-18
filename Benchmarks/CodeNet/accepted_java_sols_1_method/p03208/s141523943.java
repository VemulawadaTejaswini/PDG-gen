import java.util.*;
import java.util.Arrays;

public class Main{
        public static void main(String[] args){
                Scanner scanCnt = new Scanner(System.in);
                int N = scanCnt.nextInt();
                int K = scanCnt.nextInt();
                int array[] = new int[N];
                long result=10000000000L;
                int tmp;

                for(int i = 0;i<N;i++ ){
                        array[i] = scanCnt.nextInt();
                }

                int arraySort[] = new int[N];
                Arrays.sort(array);
                for(int i = 0;i<N;i++ ){
                        arraySort[i]=array[N-i-1];
                }

                for(int i = 0;i<N-K+1 ;i++ ){
                        tmp = arraySort[i]-arraySort[i+K-1];
                        if(tmp < result){
                                result = tmp;
                        }
                }
                System.out.println(result);
        }
}