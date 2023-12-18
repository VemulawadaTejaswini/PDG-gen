import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        long N = sn.nextLong();
        int cnt = 0;
        for(int z=2; z<N+1; z++){
            if(N == 1) break;

            if(N % z == 0){
                cnt++;
                N /= z;
            }

        }

        System.out.println(cnt);
    }
}