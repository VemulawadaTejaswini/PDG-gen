import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0;i < N;i++)    H[i] = sc.nextInt();
        int id = 0;
        int ans = 0;
        boolean f = false;
        while(true){
            f = false;
            for(int i = 0;i < N;i++){
                if(H[i] > 0){
                    f = true;
                    ans++;
                    while(H[i] > 0){
                        H[i]--;
                        i++;
                        if(i == N)    break;
                    }
                }
            }
            if(!f)  break;
        }
        System.out.println(ans);
    }
}