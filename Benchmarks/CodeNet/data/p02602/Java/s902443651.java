import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] score = new int[N];
        for(int i=0;i<N;i++){
            score[i] = sc.nextInt();
        }
        sc.close();

        int o = 0;
        int[] ans = new int[N-K+1];
        for(int i=0; i<N-K+1; i++){
            ans[i] = 1;
            for(int j=0; j<K; j++){
                o = j+i;
                ans[i] = ans[i]*score[o];
            }
            System.out.println(ans[i]);
            if(i>=1){
                if(ans[i-1]>=ans[i]){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }
        }
    }
}
