import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "";
        if (a < b) {
            for (int i = 0; i < b; i++) {
                str += a;
            }
            System.out.println(str);
        } else {
            for (int i = 0; i < a; i++) {
                str += b;
            }
            System.out.println(str);
        }
        sc.close();
    }
}