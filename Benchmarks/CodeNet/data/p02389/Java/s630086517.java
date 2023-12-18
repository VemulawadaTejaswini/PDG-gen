public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.print(a * b);
        System.out.print(' ');
        System.out.print(a + a + b + b);
        System.out.print('\n');
    }
}