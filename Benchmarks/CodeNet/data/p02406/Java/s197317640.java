import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();

        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            int x = i;
            if (x % 3 == 0) {
                System.out.print(" ");
                System.out.print(x);
            }
            else {
                while (x != 0) {
                    if (x % 10 == 3) {
                        System.out.print(" ");
                        System.out.print(i);
                        break;
                    }
                    x /= 10;
                }
            }
        }
        System.out.println();
    }
}
