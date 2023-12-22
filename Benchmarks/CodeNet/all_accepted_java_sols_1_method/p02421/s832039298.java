import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;


        int taro_count = 0;
        int hana_count = 0;
        for (i = 0; i < n; i++) {
            String a = scan.next();
            String b = scan.next();
            if (a.compareTo(b) == 0) {
                taro_count += 1;
                hana_count += 1;
            } else if (a.compareTo(b) < 0) {
                hana_count += 3;
            } else {
                taro_count += 3;
            }
        }
        System.out.println(taro_count + " " + hana_count);
    }
}