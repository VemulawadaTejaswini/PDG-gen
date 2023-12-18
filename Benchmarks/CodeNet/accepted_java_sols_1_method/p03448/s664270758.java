import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        x /= 50;
        int ans = 0;
        for (int i=0; i<=a; i++) {
            for (int j=0; j <= b; j++) {
                for (int k=0; k <= c; k++) {
                    if (10*i + 2*j + k == x) {
                        ans ++;
                    }  
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}