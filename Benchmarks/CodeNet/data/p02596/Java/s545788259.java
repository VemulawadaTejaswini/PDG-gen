import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long l = 7;
        int ans = 0;

        for(int i=1; i<=k; i++) {
            if(l % k == 0) {
                ans = i;
                break;
            }
            l = (l * 10 + 7) % k;
        }
        System.out.println(ans);
    }
}
