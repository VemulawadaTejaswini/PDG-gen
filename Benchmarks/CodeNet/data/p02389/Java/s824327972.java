import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        System.out.println(a*b+" "+2*(a+b));
    }
}