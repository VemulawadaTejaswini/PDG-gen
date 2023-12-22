import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int aji = 0;
        int jogai = 0;
        for (int i = 0, b = l+i; i < n; i++) {
            aji += l+i;
            if (Math.abs(b) >= Math.abs(l+i)) {
                b = l+i;
                jogai = b;
            }
        }
        System.out.println(aji - jogai);
    }
}