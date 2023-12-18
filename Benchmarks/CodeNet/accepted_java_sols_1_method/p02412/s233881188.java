import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, x, ans;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        while (n != 0 || x != 0) {
            ans = 0;
            for (int i = 1; i < n - 1; i++) 
                for (int j = i + 1; j < n; j++) 
                    for (int k = j + 1; k < n + 1; k++) 
                        if (i + j + k == x)
                            ans++;
            System.out.println(ans);
            n = sc.nextInt();
            x = sc.nextInt();
        }
    }
}
