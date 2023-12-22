import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        c[k - 1] += 32;
        System.out.println(new String(c));
        sc.close();
    }
}