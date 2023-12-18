public class Main {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        var x = sc.nextBigInteger();
        var op = sc.next();
        var y = sc.nextBigInteger();
        System.out.println((op.equals("+"))?x.add(y):x.subtract(y));
    }
}