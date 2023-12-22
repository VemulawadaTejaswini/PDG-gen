import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] c=N.toCharArray();

        int rank1=Character.getNumericValue(c[c.length-1]);

        if (rank1 == 2 || rank1 == 4 || rank1 == 5 || rank1 == 7 || rank1 == 9) {
            System.out.println("hon");
        } else if (rank1 == 0 || rank1 == 1 || rank1 == 6 || rank1 == 8) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }

        sc.close();
    }
}