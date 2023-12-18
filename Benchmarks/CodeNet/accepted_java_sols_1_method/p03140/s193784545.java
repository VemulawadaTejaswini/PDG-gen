import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int total = 0;

        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i) && b.charAt(i) == c.charAt(i)) {
                ;
            } else if (a.charAt(i) != b.charAt(i) && b.charAt(i) != c.charAt(i) && a.charAt(i) != c.charAt(i)) {
                total = total + 2;
            } else {
                total++;
            }
        }

        System.out.println(total);


    }

}





