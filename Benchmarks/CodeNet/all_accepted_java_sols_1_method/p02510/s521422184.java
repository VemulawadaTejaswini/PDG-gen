import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String str = sc.next();
            int m, h;
            String tmp = "";
            if (str.charAt(0) == '-' && str.length() == 1) break;
            m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                h = sc.nextInt();
                tmp = str.substring(0, h);
                str = str.substring(h, str.length());
                str += tmp;
            }
            System.out.println(str);
        }
    }

}