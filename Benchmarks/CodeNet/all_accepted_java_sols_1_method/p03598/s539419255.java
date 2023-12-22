import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            x[i] = sc.nextInt();
            if(Math.abs(K-x[i])<=Math.abs(x[i])){
                sum += Math.abs(K - x[i]);
            }
            else{
                sum += Math.abs(x[i]);
            }
        }
        System.out.println(2 * sum);

    }
}