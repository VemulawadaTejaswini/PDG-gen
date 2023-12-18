import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int sum = 0;
        int min = 0;
        for(int i = 0; i < N;i++){
            int x = sc.nextInt();
            int distance1 = Math.abs(0 - x);
            int distance2 = Math.abs(K - x);
            if(distance1 > distance2){
                min = 2 * distance2;
            }else{
                min = 2 * distance1;
            }
            sum = sum + min;
        }
        System.out.println(sum);
    }
}