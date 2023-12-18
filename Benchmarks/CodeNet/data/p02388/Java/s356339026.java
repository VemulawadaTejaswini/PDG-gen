public class Main {
    public static void main(String[] args) {
        if (args.length != 1) return;
        int x = Integer.parseInt(args[0]);
        if (x < 1 || x > 100) return;
        System.out.println((x * x * x));
    }
}