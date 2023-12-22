import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int N = sc.nextInt();
        long ans = 0;

        if(D==0){
            if(N==100){
                ans = 101;
            }
            else{
                ans = N;
            }
        }
        else if(D==1){
            if(N==100){
                ans = 10100;
            }
            else{
                for(int i=0; i<N; i++){
                    ans += 100;
                }
            }
        }
        else{
            if(N==100){
                ans = 1010000;
            }
            else{
                for(int i=0; i<N; i++){
                    ans += 10000;
                }
            }
        }
        System.out.println(ans);
    }
}