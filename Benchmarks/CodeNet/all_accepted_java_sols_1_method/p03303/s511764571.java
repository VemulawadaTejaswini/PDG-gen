import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int w = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < S.length(); i += w) {
            sb.append(S.substring(i,i+ 1));
        }
        System.out.println(sb);

    }
}
