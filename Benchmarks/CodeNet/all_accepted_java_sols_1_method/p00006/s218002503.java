import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = l - 1; i > -1; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}