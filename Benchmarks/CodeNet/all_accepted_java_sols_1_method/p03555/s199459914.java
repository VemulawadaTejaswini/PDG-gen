import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        String y = sc.next();
        String[] str1 = new String[3];
        String[] str2 = new String[3];
        str1 = x.split("");
        str2 = y.split("");
        if (str1[0].equals(str2[2]) && str1[1].equals(str2[1]) && str1[2].equals(str2[0]))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}