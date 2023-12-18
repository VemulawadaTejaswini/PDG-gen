import java.util.Scanner;

/**
 * Created by Reopard on 2014/07/06.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int N, M[][], K[], answer, count;
        while((N = sc.nextInt()) != 0){
            answer = -1;
            M = new int[N][];
            for(int i = 0; i < N; i++){
                M[i] = new int[sc.nextInt()];
                for(int j = 0; j < M[i].length; j++) M[i][j] = sc.nextInt();
            }
            K = new int[sc.nextInt()];
            for(int i = 0; i < K.length; i++) K[i] = sc.nextInt();

            for(int i = 0; i < N; i++){
                count = 0;
                M_search:
                for(int j = 0; j < M[i].length; j++){
                    for(int k: K){
                        if(M[i][j] == k){
                            count++;
                            continue M_search;
                        }
                    }
                }
                if(count == K.length){
                    if(answer != -1){
                        answer = -1;
                        break;
                    }else answer = i + 1;
                }
            }
            System.out.println(answer);
        }
    }
}