import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for(int i=0;i<N;i++){
            D[i] = sc.nextInt();
        }
    //処理
        Arrays.sort(D);
        System.out.println(D[N/2]-D[N/2-1]);

        sc.close();

    }
}
