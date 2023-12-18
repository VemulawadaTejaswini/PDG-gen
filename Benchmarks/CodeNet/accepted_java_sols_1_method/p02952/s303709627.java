import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] NS = new String[N];
        int[] l = new int[N];
        int ans = 0;

        for(int i=0; i<N; i++){
            NS[i] = String.valueOf(i+1);
            l[i] = NS[i].length();
            if(l[i]%2!=0){
                ans += 1;
            } 
        }
        System.out.println(ans);
    }
}