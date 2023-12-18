import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        boolean bool = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] % 3 != 0 && a[i] % 5 != 0) {
                    bool = false;
                    break;
                }
            }
        }
        if (bool == true) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
        sc.close();
    }
}