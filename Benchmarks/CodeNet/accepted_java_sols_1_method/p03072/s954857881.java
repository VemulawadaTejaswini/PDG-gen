import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];

        for(int n=0; n<N; n++) H[n]=sc.nextInt();

        int ans = 0;
        int highest = 0;
        for(int n=0; n<N; n++){
            if(H[n] >= highest){
                ans++;
                highest = H[n];
            }
        }
        System.out.println(ans);
    }
}
