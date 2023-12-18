import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n==0&&x==0) break;
            int c = 0, i, j=2, k=3;
            for (i = 1; i < j; i++) {
                for (j = i+1; j < k; j++) {
                    for (k = j+1; k <= n; k++) {
                        if ((i + j + k) == x) c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
