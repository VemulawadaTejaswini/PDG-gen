import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String str1 = s.substring(0, n / 2);
        String str2 = s.substring(n / 2);
        if (str1.equals(str2)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
