import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        boolean[] snuke = new boolean[n];
        for(int i=0; i<k; i++) {
            int d = in.nextInt();
            for(int j=0; j<d; j++) {
                int a = in.nextInt()-1;
                snuke[a] = true;
            }
        }
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(!snuke[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
