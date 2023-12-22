import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String u = scan.next();

        if (u.equals(s)) {
            a -= 1;
        } else if (u.equals(t)) {
            b -= 1;
        }
        System.out.println(a+" "+b);

    }
}