import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), 
        b = sc.nextInt(), 
        c = sc.nextInt(), 
        k = sc.nextInt();
        sc.close();

        for (;k > 0; k--) {
            if (a >= b) {
                b *= 2;
            } else if (b >= c) {
                c *= 2;
            } else {
                break;
            }
        }

        if (b > a && c > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
