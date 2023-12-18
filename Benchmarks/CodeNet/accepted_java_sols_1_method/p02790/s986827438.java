import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        int num = 0;
        if (a > b) {
            ans = b;
            num = a;
        } else {
            ans = a;
            num = b;
        }
        for (int i = 0; i < num; i++) {
            sb.append(ans);
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
}
