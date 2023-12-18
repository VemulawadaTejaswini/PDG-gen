import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        if (a < b) {
            sb.append("a < b");
        } else if (a == b) {
            sb.append("a == b");
        } else {
            sb.append("a > b");
        }

        System.out.println(sb);
    }
}