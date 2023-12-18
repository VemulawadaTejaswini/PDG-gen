import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i<=n; i++) {
            int d = (int)Math.log10(i) + 1;
            if(d%2==1) cnt++;
        }
        System.out.println(cnt);
    }
}