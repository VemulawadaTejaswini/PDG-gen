import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        int p[] = new int[N+1];
        for(int i=1; i<=N; i++) {
            p[i] = sc.nextInt();
        }
        int cnt=0;
        for(int i=2; i<=N-1; i++) {
            if(p[i-1] < p[i] && p[i] < p[i+1]) {
                cnt++;
            } else if(p[i-1] > p[i] && p[i] > p[i+1]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}