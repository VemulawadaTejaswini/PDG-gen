import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int change = sc.nextInt();
        char[] s = sc.next().toCharArray();

        s[change-1] = Character.toLowerCase(s[change-1]);
        System.out.println(new String(s));
    }
}


