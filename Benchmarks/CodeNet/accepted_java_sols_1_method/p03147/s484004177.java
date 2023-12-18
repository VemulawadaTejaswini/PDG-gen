import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int h[] = new int[N];
        int max = 0;
        for(int i=0; i<N; i++) {
            h[i] = sc.nextInt();
            if(max<h[i]) max=h[i];
        }
        int cnt=0;
        while(max>0) {
            boolean flg = false;
            for(int i=0; i<N; i++) {
                if(flg) {
                    if(h[i] >= max) {
                        h[i]--;
                    } else {
                        flg = false;
                        cnt++;
                    }
                } else {
                    if(h[i] >= max) {
                        flg = true;
                        h[i]--;
                    } else {
                        // NOP
                    }
                }
            }
            if(flg) cnt++;
            max--;
        }
        System.out.println(String.format("%d", cnt));
    }
}
