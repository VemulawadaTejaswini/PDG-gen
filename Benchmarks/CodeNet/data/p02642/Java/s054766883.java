import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();   // 長さ
        Integer A[] = new Integer[N];
        for(int i=0; i<N; i++)	// 数列
            A[i] = in.nextInt();
        int c = N;

        Arrays.sort(A, Collections.reverseOrder());
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if( i != j  && A[i] % A[j] == 0){
                    c--;
                    break;
                }
            }
        }

        System.out.println(c);
    }
}