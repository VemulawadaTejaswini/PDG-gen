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
        int index;
        for(int i = 0; i < N; i++){
            p = 0;
            index = i;
            for(int j = 0; j < K; j++){
                if(i == 0 && j == 0){
                    max = point[index];
                    p += point[index];
                }else{
                    p += point[index];
                }
                if(max < p){
                    max = p;
                }
                System.out.println(j + ":" + p);
                index = mas[index]-1;
            }
        }
        System.out.println(max);
    }
}