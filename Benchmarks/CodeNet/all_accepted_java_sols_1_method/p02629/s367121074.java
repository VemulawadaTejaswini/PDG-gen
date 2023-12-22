import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        num--;

        String result = "";
        String alp = "abcdefghijklmnopqrstuvwxyz";


        while (true) {
            long syou = num / alp.length();
            long mod = num % alp.length();
            
            String tmp = alp.substring((int)mod, (int)mod + 1);

            result = tmp + result;

            num = syou - 1;
            if (syou == 0) {
                break;
            }
        }

        System.out.println(result);
    }
}
