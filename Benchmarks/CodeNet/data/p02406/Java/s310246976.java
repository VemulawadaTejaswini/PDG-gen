import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0) {
                sb.append(" ").append(i);
            } else if (i%10 == 3) {
                sb.append(" ").append(i);
            }
        }
//        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb.toString());
    }
}