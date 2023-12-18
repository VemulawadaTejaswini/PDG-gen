import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String result = "";
        String alp = "abcdefghijklmnopqrstuvwxyz";

        if (num <= alp.length()) {
            result = alp.substring(num-1, num);
            System.out.println(result);
            return;
        }

        while (true) {

            int syou = num / alp.length();
            int mod = num % alp.length();
            String tmp = alp.substring(mod-1, mod);
            result = tmp + result;

            num = syou;
            if (syou == 0) {
                break;
            }
        }

        System.out.println(result);
    }
}
