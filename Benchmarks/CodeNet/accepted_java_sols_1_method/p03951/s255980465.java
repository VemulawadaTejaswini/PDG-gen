import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int i;
        for (i = 0; i < n ; i++) {
            if(s.substring(i, s.length()).equals(t.substring(0, t.length()-i))) break;
        }
        System.out.println((n+i));
    }
}
