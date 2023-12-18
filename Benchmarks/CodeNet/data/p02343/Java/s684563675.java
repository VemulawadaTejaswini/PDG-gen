import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++)
            c[i] = i;
        
        for (int i = 0; i < q; i++) {
            int com = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            if (com == 0) {
                for (int j = 0; j < n; j++) 
                    if (c[j] == c[x] && j != x) c[j] = c[y];
                c[x] = c[y];
            } else {
                System.out.println(c[x] == c[y] ? 1 : 0);
            }
        }
    }
}

