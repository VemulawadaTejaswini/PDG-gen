import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();

        if(K%2!=0){
            long x = 0;
            for(int i=1; i<=N; i++){
                if(i%K==0){
                    x += 1;
                }
            }
            System.out.println(x * x * x);
        }
        else{
            long x = 0;
            long y = 0;
            for(int i=1; i<=N; i++){
                if(i%K==0){
                    x += 1;
                }
                else if(i%K==K/2){
                    y += 1;
                }
            }
            System.out.println(x * x * x + y * y * y);
        }
    }
}