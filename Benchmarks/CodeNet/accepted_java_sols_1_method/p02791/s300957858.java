import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000000;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int p = Integer.parseInt(sc.next());
            if(p < min) ans++;
            min = Math.min(min, p);
        }
        System.out.println(ans);
    }
}
