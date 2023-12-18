import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int min = 1001;
        int[] c = new int[N];
        int[] t = new int[N];

        for(int i=0; i<N; i++){
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
            if(t[i]<=T){
                min = Math.min(min, c[i]);
            }
        }
        if(min==1001){
            System.out.println("TLE");
        }
        else{
            System.out.println(min);
        }
    }
}