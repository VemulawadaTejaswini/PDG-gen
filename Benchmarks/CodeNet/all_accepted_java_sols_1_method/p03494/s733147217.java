import java.util.*;

public class Main{
    public static void main(String [] argc){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = (1<<31)-1;
        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            int tmp = 0;
            while(A%2 == 0){
                A /= 2;
                tmp++;
            }
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
}