import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();

        s[k-1] = Character.toLowerCase(s[k-1]);

        for (char c : s)
            System.out.print(c);

        System.out.println();
    }
}