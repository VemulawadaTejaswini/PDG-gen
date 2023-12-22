import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a = 0;
        if(N > 1 && M > 1){
            for(int i = 1; i < N; i++){
                for(int j = i; j < N; j++){
                    a++;
                }
            }
            for(int i = 1; i < M; i++){
                for(int j = i; j < M; j++){
                    a++;
                }
            }
        }else if(N > 1 && M <= 1){
            for(int i = 1; i < N; i++){
                for(int j = i; j < N; j++){
                    a++;
                }
            }
        }else if(M > 1 && N <= 1){
            for(int i = 1; i < M; i++){
                for(int j = i; j < M; j++){
                    a++;
                }
            }
        }else{
            a = 0;
        }
        System.out.println(a);
    }
}