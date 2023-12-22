import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++) {
            int nn = Integer.toString(i).length();
            if(nn % 2 != 0) ans++;
        }
        System.out.println(ans);
    }
}