import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] d = new int[N];
        //d[0] = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=N-1; i++){
            d[i] = sc.nextInt();
            for(int j=0; j<i; j++){
                sum = sum + d[i] * d[j];
            }
        }
        System.out.println(sum);
    }
}