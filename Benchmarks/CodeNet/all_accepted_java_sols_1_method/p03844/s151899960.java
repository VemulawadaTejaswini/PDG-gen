import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        boolean op = sc.next().equals("+");
        int b = Integer.parseInt(sc.next());
        if (op)
            System.out.println(a + b);
        else
            System.out.println(a - b);
    }
}