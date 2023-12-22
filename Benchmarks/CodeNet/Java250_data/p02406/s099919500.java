import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0) {
                sb.append(" ").append(i);
            } else {
                calc(i, i);
            }
        }
//        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb.toString());
    }
    
    public static void calc(int n, int i) {
        if (n%10 == 3) {
            sb.append(" ").append(i);
            return;
        } else if (n/10 > 0) {
            calc(n/10, i);
        }
    }
}