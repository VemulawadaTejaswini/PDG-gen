import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N];
        for(int n=0; n<N; n++) L[n]=sc.nextInt();

        int ans=1;
        int pos = 0;
        for(int n=0; n<N; n++){
            pos+=L[n];
            if(pos<=X) ans++;
        }
        System.out.println(ans);

    }
}