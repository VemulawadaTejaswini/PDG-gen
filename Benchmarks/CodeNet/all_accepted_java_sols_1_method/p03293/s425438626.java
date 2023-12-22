import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        boolean same = false;
        for (int i = 0; i < s1.length(); i++) {
            sb.setLength(0);
            sb.append(s1.substring(i)).append(s1.substring(0, i));
            if (sb.toString().compareTo(s2) == 0) {
                same = true;
                break;
            }
        }
        if (same)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
