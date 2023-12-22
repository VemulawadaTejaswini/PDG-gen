import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer str = new StringBuffer(scan.next());
        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            String order = scan.next();
            int a = scan.nextInt(), b = scan.nextInt() + 1;
            switch (order) {
                case "replace":
                    String p = scan.next();
                    str = str.replace(a, b, p);
                    break;
                case "reverse":
                    StringBuffer tmpStr = new StringBuffer(str.substring(a, b)).reverse();
                    str = str.replace(a, b, tmpStr.toString());
                    break;
                case "print":
                    System.out.println(str.substring(a, b));
                    break;
            }
        }
    }
}