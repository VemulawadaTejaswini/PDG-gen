import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int l = 1;
        for (int i = s.length()-1; i > 1; i--) {
            if (i % 2 == 0) {
                continue;
            }
            l = i/2;
            if (s.substring(0, l).equals(s.substring(l, i-1))) {
                break;
            }
        }

        System.out.println(l*2);
    }

}