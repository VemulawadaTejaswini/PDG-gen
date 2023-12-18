import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1 = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            String[] a = new String[]{sc.next(), sc.next()};
            int z = a[0].compareTo(a[1]);
            if (z > 0) {
                s1 += 3;
            } else if (z < 0) {
                s2 += 3;
            } else {
                s1++;
                s2++;
            }
        }
        System.out.println(s1 + " " + s2);
    }
}