import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < h.length; i++) {
            h[i] = scanner.nextInt();
        }
        int[] hc = new int[N];
        int ans = 0;
        while(true){
            int count = 0;
            boolean section = false;
            for (int i = 0; i < h.length; i++) {
                if(hc[i] < h[i]){
                    if(!section) count++;
                    section = true;
                    hc[i] ++;
                }else{
                    section = false;
                }
            }
            ans += count;
            if(count == 0) break;
        }
        System.out.println(ans);
    }
}