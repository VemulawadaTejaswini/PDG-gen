public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BigDecimal a = scanner.nextBigDecimal();
            BigDecimal b = scanner.nextBigDecimal();
            System.out.printf("%s %s %s\n", a.divide(b).toBigInteger().toString(), a.remainder(b).toBigInteger().toString(), a.divide(b).toString());
        }
    }
}