import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        String res = "YES";
        for(int i = 1; i <= n; i++) p[i] = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i != p[i] && p[p[i]] == i) {
                p[p[i]] = p[i];
                p[i] = i;
                break;
            }
        }
        for(int i = 1; i < n; i++) if(p[i] > p[i + 1]) res = "NO";
        System.out.println(res);
    }
}
