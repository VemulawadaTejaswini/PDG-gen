import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner("5\n10 4 8 7 3");
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        int max = 0;
        int cnt = 0;
        int prev = h[0];
        for(int i=1;i<n;i++){
            if(h[i]>prev){
                max = Math.max(cnt, max);
                cnt = 0;
            }else{
                cnt++;
            }
            prev = h[i];
        }
        max = Math.max(cnt, max);
        System.out.println(max);
    }
}