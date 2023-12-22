import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int index = 0;
        int num = 1;
        for (int i = 0 ; i < s.length(); i++) {
            if (!s.substring(i, i + 1).equals("1")) {
                index = i;
                num = Integer.valueOf(s.substring(i, i+ 1));
                break;
            }
        }
        if (k <= index) {
            System.out.println(1);
        } else {
            System.out.println(num);
        }
    }
}