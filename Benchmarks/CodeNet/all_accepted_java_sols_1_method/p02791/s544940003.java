import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int ans = 1;
        a[0] = sc.nextInt();
        int min = a[0];
        for(int i=1; i<N; i++){
            a[i] = sc.nextInt();
            if(a[i]<=min){
                //System.out.println(i+":"+min+">"+a[i]);
                min = a[i];
                ans++;
            }
        }
        System.out.println(ans);
    }
}
