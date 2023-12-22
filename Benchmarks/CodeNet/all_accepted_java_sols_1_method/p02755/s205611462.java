import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int noTaxAmin = a * 100 % 8 == 0 ? a * 100 / 8 : a * 100 / 8 + 1;
        int noTaxAmax = (a + 1) * 100 % 8 == 0 ? (a + 1) * 100 / 8 - 1 : (a + 1) * 100 / 8;
        int noTaxBmin = b * 100 % 10 == 0 ? b * 100 / 10 : b * 100 / 10 + 1;
        int noTaxBmax = (b + 1) * 100 % 10 == 0 ? (b + 1) * 100 / 10 - 1 : (b + 1) * 100 / 10;
        if (noTaxAmin <= noTaxBmax && noTaxBmin <= noTaxAmax) {
            System.out.println(Math.max(noTaxAmin, noTaxBmin));

        }else {
            System.out.println(-1);
        }
    }
}
