import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        System.out.println(a * b + " " + (a + b) * 2);
    }
}