import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        long K = Long.parseLong(scan.next());

        long count = 0;

        for(int i =0;i<S.length();i++) {

            if (S.charAt(i) != '1') {

                if (K < i + 1) {
                    System.out.println(1);
                    return;
                } else {
                    System.out.println(S.charAt(i));
                    return;
                }
            }
        }


        System.out.println(1);
    }
}