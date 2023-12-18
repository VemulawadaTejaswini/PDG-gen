public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args.length == 1 ? args[0] : "0");
        System.out.println((int) Math.pow(x, 3));
    }
}