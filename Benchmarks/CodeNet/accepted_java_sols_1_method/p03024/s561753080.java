import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long count = S.chars().filter(ch -> ch == 'x').count();
        System.out.println(count >= 8 ? "NO" : "YES");
    }

}
