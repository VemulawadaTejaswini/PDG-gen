import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = Integer.max(a, c);
        int min = Integer.min(b, d);

        int cul = 0;
        if(min-max > 0) {
            cul = min-max;
        }
        System.out.println(cul);
    }
}