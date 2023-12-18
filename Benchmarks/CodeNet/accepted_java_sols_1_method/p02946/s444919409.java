import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        for (int i=X-K+1;i<X+K;i++) {
            sb.append(i);
            if (i != X+K-1) sb.append(" ");
        }
        String ans = sb.toString();
        System.out.println(ans);
    }
}
