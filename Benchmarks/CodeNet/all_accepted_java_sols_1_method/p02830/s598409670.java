import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        String s1 = s[0];
        String s2 = s[1];
        for (int i = 0; i < n; i++) {
            System.out.print(String.valueOf(s1.charAt(i)) + String.valueOf(s2.charAt(i)));
        }
    }
}
