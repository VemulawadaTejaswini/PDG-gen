import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               int n = scanner.nextInt();
        int M=-1000000,m=1000000;
        int S = 0;
 
        for(int i = 1;i <= n;i++){
            int x = scanner.nextInt();
            M = Math.max(M, x);
            m = Math.min(m, x);
            S = S+x;
        }
        System.out.println(m+" "+M+" "+S);
    }
}