
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(str1.charAt(0)));
        sb.append(String.valueOf(str2.charAt(1)));
        sb.append(String.valueOf(str3.charAt(2)));

        System.out.println(sb.toString());
        sc.close();
    }

}
