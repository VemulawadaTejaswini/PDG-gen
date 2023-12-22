import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String a = sc.next();
        String[] b = a.split("");
        for (int i = 0; i < b.length; i++) {
            int c = b[i].charAt(0);
            String next = String.valueOf((char) (c + d));
            if ((c + d) > 90) {
                c = c + d - 26;
                next = String.valueOf((char) (c));
            }
            System.out.print(next);
        }
    }
}