import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int d = in.nextInt();
        int ans = 0;
        for(int i=l; i<=r; i++) {
            if(i%d==0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
