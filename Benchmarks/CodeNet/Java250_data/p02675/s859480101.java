import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int i = a.length() - 1;

        String target = a.substring(i);

        String result;
        if (target.equals("3")) {
            result = "bon";
        } else if (target.equals("0") || target.equals("1") || target.equals("6") || target.equals("8")) {
            result = "pon";
        } else {
            result = "hon";
        }

        System.out.println(result);

    }
}
