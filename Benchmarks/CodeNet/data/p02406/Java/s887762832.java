import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        for (int i = 1; i <= n; i++) {
            int x =i;
            if (x % 3 == 0) {
                System.out.printf(" %d", i);
            }
            else {
                while (true) {
                    if (x % 10 == 3) {
                        System.out.printf(" %d", i);
                        break;
                    }
                    x /= 10;
                    if (x != 0) continue;
                    else break;
                }
            }
 
        }        System.out.printf("\n");
 
    }
}
