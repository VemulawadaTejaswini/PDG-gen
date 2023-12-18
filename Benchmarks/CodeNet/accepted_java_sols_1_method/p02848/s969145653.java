import java.sql.SQLTransactionRollbackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ans = "";

        for (int i = 0; i < str.length; i++) {
            ans += abc.toCharArray()[((abc.indexOf(str[i])+n) % 26)];
        }

        System.out.println(ans);
    }

}
