import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] mas = new int[N];
        long[] point = new long[N];
        for(int i = 0; i < N; i++){
            mas[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++){
            point[i] = scan.nextInt();
        }
        
        
        long max = 0;
        long p = 0;
        
        for(int i = 0; i < N; i++){
            p = 0;
            for(int j = 0; j < K; j++){
                if(i == 0 && j == 0){
                    max = point[mas[j]];
                }else{
                    p += point[mas[j]];
                }
                if(max < p){
                    max = p;
                }
                //System.out.println(j + ":" +p);
            }
        }
        System.out.println(max);
    }
}
