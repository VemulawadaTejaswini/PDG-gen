import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int t;
        if(a>b) {
            t = a;
            a = b;
            b = t;
        }
        if(b>c) {
            t = b;
            b = c;
            c = t;
        }
        if(a>b) {
            t = a;
            a = b;
            b = t;
        }
        System.out.println(a+" "+b+" "+c);
    }
}