import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String[] s = sc.next().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        while (!(a == 0 && b == 0)) {
            if (a <= b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
            s = sc.next().split(" ");
            a = Integer.parseInt(s[0]);
            b = Integer.parseInt(s[1]);
        }
    }
}