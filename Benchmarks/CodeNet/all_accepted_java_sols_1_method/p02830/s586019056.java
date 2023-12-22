import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < s.length ; i++) {
            sb.append(s[i]);
            sb.append(t[i]);
        }
        System.out.println(sb.toString());
    }

}