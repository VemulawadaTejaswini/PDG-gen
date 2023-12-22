import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        sc.close();

        int numHeadingOne = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                numHeadingOne++;
            } else {
                break;
            }
        }
//        System.out.println(numHeadingOne);

        if (k <= numHeadingOne) {
            System.out.println('1');
        } else {
            System.out.println(s.charAt(numHeadingOne));
        }

    }
}
