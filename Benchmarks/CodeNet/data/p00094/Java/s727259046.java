public class Main {
    static final double TSUBO = 3.305785;

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        double res = (double) a * (double) b / TSUBO;
        System.out.println(Math.ceil(res * 1000000) / 1000000);
    }
}