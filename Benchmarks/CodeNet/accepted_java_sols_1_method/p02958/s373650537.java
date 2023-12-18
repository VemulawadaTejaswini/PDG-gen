import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        for(int i=1; i<=n; i++) {
            int p = in.nextInt();
            if(i!=p) {
                c++;
            }
        }
        System.out.println((c==0||c==2) ? "YES" : "NO");
    }
}
