import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int c = Integer.parseInt(a.substring(0, 2));
        int d = Integer.parseInt(a.substring(2, 4));

        if (c >= 1 && c <= 12 && d >= 1 && d <= 12) {
            System.out.println("AMBIGUOUS");
        } else if (c >= 1 && c <= 12) {
            System.out.println("MMYY");
        } else if (d >= 1 && d <= 12) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
    }
}
