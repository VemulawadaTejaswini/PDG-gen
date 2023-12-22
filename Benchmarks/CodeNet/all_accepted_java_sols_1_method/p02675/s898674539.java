import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "hon";
        String s = sc.next();
        if(s.endsWith("0") || s.endsWith("1") || s.endsWith("6") || s.endsWith("8")) {
            res = "pon";
        } else if(s.endsWith("3")) {
            res = "bon";
        }
        System.out.println(res);
    }
}
