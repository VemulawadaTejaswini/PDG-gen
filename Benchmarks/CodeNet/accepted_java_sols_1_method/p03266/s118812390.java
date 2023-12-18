import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        long count_1 = 0;
        long count_2 = 0;
            if(K%2 == 1){
                if(N < K){
                    System.out.println(0);
                } else {
                    for(int i = K; i <= N; i = i + K){
                        count_1++;
                    }
                    System.out.println((long)Math.pow(count_1, 3));
                }
            } else{
                if(N >= (K/2)){
                    for(int i = K/2; i <= N; i = i + K){
                        count_1++;
                    }
                }
                if(N >= K){
                    for(int i = K; i <= N; i = i+K){
                        count_2++;
                    }
                }
                System.out.println((long)(Math.pow(count_1, 3)+Math.pow(count_2, 3)));
            }
    }
}